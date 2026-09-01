package com.example.vehiculo.repositorio;

import com.example.vehiculo.modelo.Propietario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PropietarioRepository extends JpaRepository<Propietario, Integer> {
}