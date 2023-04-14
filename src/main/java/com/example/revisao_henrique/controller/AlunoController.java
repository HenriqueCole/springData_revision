package com.example.revisao_henrique.controller;

import com.example.revisao_henrique.dto.AlunoDTO;
import com.example.revisao_henrique.model.entity.Aluno;
import com.example.revisao_henrique.model.service.AlunoService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@AllArgsConstructor
@RequestMapping("/aluno")
public class AlunoController {
    private AlunoService alunoService;

    @PostMapping
    public ResponseEntity<Object> save(@RequestBody @Valid AlunoDTO alunoDTO) {
        Aluno aluno = new Aluno();
        BeanUtils.copyProperties(alunoDTO, aluno);
        alunoService.save(aluno);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<Object> findAll() {
        return ResponseEntity.ok(alunoService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> findById(@PathVariable Long id) {
        return ResponseEntity.ok(alunoService.findById(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteById(@PathVariable Long id) {
        alunoService.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> update(@PathVariable Long id, @RequestBody @Valid AlunoDTO alunoDTO) {
        Aluno aluno = new Aluno();
        BeanUtils.copyProperties(alunoDTO, aluno);
        aluno.setId(id);
        alunoService.save(aluno);
        return ResponseEntity.ok().build();
    }
}
