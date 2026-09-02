package com.example.vehiculo.repositorio;

import com.example.vehiculo.modelo.Vehiculo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VehiculoRepository extends JpaRepository<Vehiculo, Integer> {
    List<Vehiculo> findByMarca(String m);
}
