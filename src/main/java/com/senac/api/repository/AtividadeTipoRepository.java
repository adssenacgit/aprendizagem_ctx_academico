package com.senac.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.senac.api.entity.AtividadeTipo;

@Repository
public interface AtividadeTipoRepository extends JpaRepository<AtividadeTipo, Long>{

}
