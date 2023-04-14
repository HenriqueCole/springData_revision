package com.example.revisao_henrique.model.service;

import com.example.revisao_henrique.model.entity.Disciplina;
import com.example.revisao_henrique.repository.DisciplinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DisciplinaService {
    @Autowired
    private DisciplinaRepository disciplinaRepository;

    public <S extends Disciplina> S save(S entity) {
        return disciplinaRepository.save(entity);
    }

    public Optional<Disciplina> findById(Long aLong) {
        return disciplinaRepository.findById(aLong);
    }

    public boolean existsById(Long aLong) {
        return disciplinaRepository.existsById(aLong);
    }

    public void deleteById(Long aLong) {
        disciplinaRepository.deleteById(aLong);
    }

    public List<Disciplina> findAll() {
        return disciplinaRepository.findAll();
    }
}
