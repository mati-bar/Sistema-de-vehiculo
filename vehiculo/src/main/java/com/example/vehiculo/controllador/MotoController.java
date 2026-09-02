package com.example.vehiculo.controllador;

import com.example.vehiculo.modelo.Moto;
import com.example.vehiculo.repositorio.MotoRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/motos")
public class MotoController {


    private final MotoRepository repositorio;

    public MotoController(MotoRepository repositorio) {
        this.repositorio = repositorio;
    }


    @GetMapping
    public List<Moto> listar() {
        return repositorio.findAll();
    }


    @GetMapping("/{id}")
    public ResponseEntity<Moto> obtenerPorId(@PathVariable Integer id) {
        return repositorio.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }


    @PostMapping
    public ResponseEntity<Moto> crear(@RequestBody Moto nuevo) {
        Moto guardado = repositorio.save(nuevo);
        return ResponseEntity.status(201).body(guardado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Integer id) {
        repositorio.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
