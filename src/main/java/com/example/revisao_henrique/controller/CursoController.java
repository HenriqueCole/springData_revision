package com.example.revisao_henrique.controller;

import com.example.revisao_henrique.dto.CursoDTO;
import com.example.revisao_henrique.model.entity.Curso;
import com.example.revisao_henrique.model.service.CursoService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;

@Controller
@AllArgsConstructor
@RequestMapping("/curso")
public class CursoController {
    private CursoService cursoService;

    @PostMapping
    public ResponseEntity<Object> save(@RequestBody @Valid CursoDTO cursoDTO) {
        Curso curso = new Curso();
        BeanUtils.copyProperties(cursoDTO, curso);
        cursoService.save(curso);
        return ResponseEntity.status(HttpStatus.CREATED).body(curso);
    }

    @GetMapping
    public ResponseEntity<Object> findAll() {
        return ResponseEntity.ok(cursoService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> findById(@PathVariable Long id) {
        return ResponseEntity.ok(cursoService.findById(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteById(@PathVariable Long id) {
        cursoService.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> update(@PathVariable Long id, @RequestBody @Valid CursoDTO cursoDTO) {
        Curso curso = new Curso();
        BeanUtils.copyProperties(cursoDTO, curso);
        curso.setId(id);
        cursoService.save(curso);
        return ResponseEntity.ok().build();
    }
}
