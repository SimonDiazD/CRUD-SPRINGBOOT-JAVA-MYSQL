package com.example.veterinaria.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.veterinaria.models.Perro;

public interface PerroRepository extends JpaRepository <Perro, Long> {

}


