package com.example.revisao_henrique.model.service;

import com.example.revisao_henrique.model.entity.Professor;
import com.example.revisao_henrique.repository.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProfessorService {
    @Autowired
    private ProfessorRepository professorRepository;

    public <S extends Professor> S save(S entity) {
        return professorRepository.save(entity);
    }

    public Optional<Professor> findById(Long aLong) {
        return professorRepository.findById(aLong);
    }

    public boolean existsById(Long aLong) {
        return professorRepository.existsById(aLong);
    }

    public void deleteById(Long aLong) {
        professorRepository.deleteById(aLong);
    }

    public List<Professor> findAll() {
        return professorRepository.findAll();
    }
}
