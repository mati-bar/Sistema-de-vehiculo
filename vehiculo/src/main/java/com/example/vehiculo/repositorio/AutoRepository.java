package com.example.vehiculo.repositorio;

import com.example.vehiculo.modelo.Auto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AutoRepository extends JpaRepository<Auto, Integer> {
}