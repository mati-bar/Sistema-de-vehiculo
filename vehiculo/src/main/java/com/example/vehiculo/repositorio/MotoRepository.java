package com.example.vehiculo.repositorio;

import com.example.vehiculo.modelo.Moto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MotoRepository extends JpaRepository<Moto, Integer> {
}