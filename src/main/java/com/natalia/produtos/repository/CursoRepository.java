package com.natalia.produtos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.natalia.produtos.entity.Curso;

public interface CursoRepository extends JpaRepository<Curso,Long>{
}
