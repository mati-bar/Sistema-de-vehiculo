package com.example.vehiculo.controllador;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.*;
import com.example.vehiculo.modelo.*;
import com.example.vehiculo.repositorio.AutoRepository;
import org.springframework.http.ResponseEntity;


import java.util.List;

@RestController
@RequestMapping("/autos")
public class AutoController {

    // importo repositorios
    private final AutoRepository repositorio;

    public AutoController(AutoRepository repositorio) {
        this.repositorio = repositorio;
    }

    @GetMapping
    public List<Auto> listar() {
        return repositorio.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Auto> obtenerPorId(@PathVariable Integer id) {
        return repositorio.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Auto> crear(@RequestBody Auto nuevo) {
        Auto guardado = repositorio.save(nuevo);
        return ResponseEntity.status(201).body(guardado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Integer id) {
        repositorio.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}