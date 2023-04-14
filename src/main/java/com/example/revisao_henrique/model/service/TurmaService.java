package com.example.revisao_henrique.model.service;

import com.example.revisao_henrique.model.entity.Turma;
import com.example.revisao_henrique.repository.TurmaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TurmaService {
    @Autowired
    private TurmaRepository turmaRepository;

    public <S extends Turma> S save(S entity) {
        return turmaRepository.save(entity);
    }

    public Optional<Turma> findById(Long aLong) {
        return turmaRepository.findById(aLong);
    }

    public boolean existsById(Long aLong) {
        return turmaRepository.existsById(aLong);
    }

    public void deleteById(Long aLong) {
        turmaRepository.deleteById(aLong);
    }

    public List<Turma> findAll() {
        return turmaRepository.findAll();
    }
}
