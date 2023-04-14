package com.example.revisao_henrique.controller;

import com.example.revisao_henrique.dto.ProfessorDTO;
import com.example.revisao_henrique.model.entity.Professor;
import com.example.revisao_henrique.model.service.ProfessorService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@AllArgsConstructor
@RequestMapping("/professor")
public class ProfessorController {
    private ProfessorService professorService;

    @PostMapping
    public ResponseEntity<Object> save(@RequestBody @Valid ProfessorDTO professorDTO) {
        Professor professor = new Professor();
        BeanUtils.copyProperties(professorDTO, professor);
        professorService.save(professor);
        return ResponseEntity.status(HttpStatus.CREATED).body(professor);
    }

    @GetMapping
    public ResponseEntity<Object> findAll() {
        return ResponseEntity.ok(professorService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> findById(@PathVariable Long id) {
        return ResponseEntity.ok(professorService.findById(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteById(@PathVariable Long id) {
        professorService.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> update(@PathVariable Long id, @RequestBody @Valid ProfessorDTO professorDTO) {
        Professor professor = new Professor();
        BeanUtils.copyProperties(professorDTO, professor);
        professor.setId(id);
        professorService.save(professor);
        return ResponseEntity.ok().build();
    }
}
