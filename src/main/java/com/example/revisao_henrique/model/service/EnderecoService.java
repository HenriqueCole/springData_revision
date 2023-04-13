package com.example.revisao_henrique.model.service;

import com.example.revisao_henrique.model.entity.Endereco;
import com.example.revisao_henrique.repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EnderecoService {
    @Autowired
    private EnderecoRepository enderecoRepository;

    public <S extends Endereco> S save(S entity) {
        return enderecoRepository.save(entity);
    }

    public Optional<Endereco> findById(Long aLong) {
        return enderecoRepository.findById(aLong);
    }

    public boolean existsById(Long aLong) {
        return enderecoRepository.existsById(aLong);
    }

    public void deleteById(Long aLong) {
        enderecoRepository.deleteById(aLong);
    }

    public List<Endereco> findAll(Sort sort) {
        return enderecoRepository.findAll(sort);
    }
}
