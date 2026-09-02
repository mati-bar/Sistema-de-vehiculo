package com.example.vehiculo.controllador;

import com.example.vehiculo.modelo.Propietario;
import com.example.vehiculo.repositorio.PropietarioRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/propietarios")
public class PropietarioController {

    private final PropietarioRepository repositorio;

    public PropietarioController(PropietarioRepository repositorio) {
        this.repositorio = repositorio;
    }

    @GetMapping
    public List<Propietario> listar() {
        return repositorio.findAll();
    }


    @GetMapping("/{id}")
    public ResponseEntity<Propietario> obtenerPorId(@PathVariable Integer id) {
        return repositorio.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }




    @PostMapping
    public ResponseEntity<Propietario> crear(@RequestBody Propietario nuevo) {
        Propietario guardado = repositorio.save(nuevo);
        return ResponseEntity.status(201).body(guardado);
    }




    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Integer id) {
        repositorio.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}