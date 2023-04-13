package com.example.revisao_henrique.model.service;

import com.example.revisao_henrique.model.entity.Curso;
import com.example.revisao_henrique.repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CursoService {
    @Autowired
    private CursoRepository cursoRepository;

    public <S extends Curso> S save(S entity) {
        return cursoRepository.save(entity);
    }

    public Optional<Curso> findById(Long aLong) {
        return cursoRepository.findById(aLong);
    }

    public boolean existsById(Long aLong) {
        return cursoRepository.existsById(aLong);
    }

    public void deleteById(Long aLong) {
        cursoRepository.deleteById(aLong);
    }

    public List<Curso> findAll(Sort sort) {
        return cursoRepository.findAll(sort);
    }
}
