package com.example.revisao_henrique.model.service;

import com.example.revisao_henrique.model.entity.Aluno;
import com.example.revisao_henrique.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlunoService {
    @Autowired
    private AlunoRepository alunoRepository;

    public <S extends Aluno> S save(S entity) {
        return alunoRepository.save(entity);
    }

    public Optional<Aluno> findById(Long aLong) {
        return alunoRepository.findById(aLong);
    }

    public boolean existsById(Long aLong) {
        return alunoRepository.existsById(aLong);
    }

    public void deleteById(Long aLong) {
        alunoRepository.deleteById(aLong);
    }

    public List<Aluno> findAll(Sort sort) {
        return alunoRepository.findAll(sort);
    }
}
