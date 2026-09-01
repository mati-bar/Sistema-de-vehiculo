package com.example.vehiculo.repositorio;

import com.example.vehiculo.modelo.Vehiculo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehiculoRepository extends JpaRepository<Vehiculo, Integer> {
}
