package com.example.revisao_henrique.controller;

import com.example.revisao_henrique.dto.DisciplinaDTO;
import com.example.revisao_henrique.model.entity.Disciplina;
import com.example.revisao_henrique.model.service.DisciplinaService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@AllArgsConstructor
@RequestMapping("/disciplina")
public class DisciplinaController {
    private DisciplinaService disciplinaService;

    @PostMapping
    public ResponseEntity<Object> save(@RequestBody @Valid DisciplinaDTO disciplinaDTO) {
        Disciplina disciplina = new Disciplina();
        BeanUtils.copyProperties(disciplinaDTO, disciplina);
        disciplinaService.save(disciplina);
        return ResponseEntity.status(HttpStatus.CREATED).body(disciplina);
    }

    @GetMapping
    public ResponseEntity<Object> findAll() {
        return ResponseEntity.ok(disciplinaService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> findById(@PathVariable Long id) {
        return ResponseEntity.ok(disciplinaService.findById(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteById(@PathVariable Long id) {
        disciplinaService.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> update(@PathVariable Long id, @RequestBody @Valid DisciplinaDTO disciplinaDTO) {
        Disciplina disciplina = new Disciplina();
        BeanUtils.copyProperties(disciplinaDTO, disciplina);
        disciplina.setId(id);
        disciplinaService.save(disciplina);
        return ResponseEntity.ok().build();
    }
}
