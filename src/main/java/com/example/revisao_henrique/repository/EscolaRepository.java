package com.example.revisao_henrique.repository;

import com.example.revisao_henrique.model.entity.Escola;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EscolaRepository extends JpaRepository<Escola, Long> {
}
