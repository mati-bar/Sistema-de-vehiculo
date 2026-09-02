package com.example.vehiculo.controllador;

import com.example.vehiculo.modelo.Vehiculo;
import com.example.vehiculo.repositorio.VehiculoRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vehiculos")
public class VehiculoController {

    private final VehiculoRepository repositorio;

    public VehiculoController(VehiculoRepository repositorio) {
        this.repositorio = repositorio;
    }

    @GetMapping
    public List<Vehiculo> listar(@RequestParam(required = false) String marca) {
        List<Vehiculo> traerVehiculo = repositorio.findByMarca(marca);
        traerVehiculo.forEach(vehiculo -> {
            System.out.println(vehiculo.getMarca());

        });

        return traerVehiculo;
    }


    @GetMapping("/{id}")
    public ResponseEntity<Vehiculo> obtenerPorId(@PathVariable Integer id) {
        return repositorio.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }



    @PostMapping
    public ResponseEntity<Vehiculo> crear(@RequestBody Vehiculo nuevo) {
        Vehiculo guardado = repositorio.save(nuevo);
        return ResponseEntity.status(201).body(guardado);
    }




    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Integer id) {
        repositorio.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}