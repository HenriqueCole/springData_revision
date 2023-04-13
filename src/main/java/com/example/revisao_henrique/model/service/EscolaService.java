package com.example.revisao_henrique.model.service;

import com.example.revisao_henrique.model.entity.Escola;
import com.example.revisao_henrique.repository.EscolaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EscolaService {
    @Autowired
    private EscolaRepository escolaRepository;

    public <S extends Escola> S save(S entity) {
        return escolaRepository.save(entity);
    }

    public Optional<Escola> findById(Long aLong) {
        return escolaRepository.findById(aLong);
    }

    public boolean existsById(Long aLong) {
        return escolaRepository.existsById(aLong);
    }

    public void deleteById(Long aLong) {
        escolaRepository.deleteById(aLong);
    }

    public List<Escola> findAll(Sort sort) {
        return escolaRepository.findAll(sort);
    }
}
