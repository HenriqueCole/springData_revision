package com.example.revisao_henrique.controller;

import com.example.revisao_henrique.dto.EscolaDTO;
import com.example.revisao_henrique.model.entity.Escola;
import com.example.revisao_henrique.model.service.EscolaService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@AllArgsConstructor
@RequestMapping("/escola")
public class EscolaController {
    private EscolaService escolaService;

    @PostMapping
    public ResponseEntity<Object> save(@RequestBody @Valid EscolaDTO escolaDTO) {
        Escola escola = new Escola();
        BeanUtils.copyProperties(escolaDTO, escola);
        escolaService.save(escola);
        return ResponseEntity.status(HttpStatus.CREATED).body(escola);
    }

    @GetMapping
    public ResponseEntity<Object> findAll() {
        return ResponseEntity.ok(escolaService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> findById(@PathVariable Long id) {
        return ResponseEntity.ok(escolaService.findById(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteById(@PathVariable Long id) {
        escolaService.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> update(@PathVariable Long id, @RequestBody @Valid EscolaDTO escolaDTO) {
        Escola escola = new Escola();
        BeanUtils.copyProperties(escolaDTO, escola);
        escola.setId(id);
        escolaService.save(escola);
        return ResponseEntity.ok().build();
    }
}
