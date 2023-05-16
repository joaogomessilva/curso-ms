package com.examplo.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.examplo.demo.entities.Trabalhador;

public interface TrabalhadorRepository extends JpaRepository<Trabalhador, Long> {

}
