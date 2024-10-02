package com.example.veterinaria.controllers;

import com.example.veterinaria.models.Perro;
import com.example.veterinaria.repositories.PerroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dogs")
public class PerroController {

    @Autowired
    private PerroRepository perroRepository;

    @GetMapping
    public List<Perro> getAllPerros() {
        return perroRepository.findAll();
    }

    @PostMapping
    public Perro createPerro(@RequestBody Perro perro) {
        return perroRepository.save(perro);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Perro> getPerroById(@PathVariable Long id) {
        Perro perro = perroRepository.findById(id).orElse(null);
        if (perro == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(perro);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Perro> updatePerro(@PathVariable Long id, @RequestBody Perro perroDetails) {
        Perro perro = perroRepository.findById(id).orElse(null);
        if (perro == null) {
            return ResponseEntity.notFound().build();
        }
        perro.setNombre(perroDetails.getNombre());
        perro.setRaza(perroDetails.getRaza());
        perro.setEdad(perroDetails.getEdad());
        perro.setFechaRegistro(perroDetails.getFechaRegistro());

        Perro updatedPerro = perroRepository.save(perro);
        return ResponseEntity.ok(updatedPerro);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePerro(@PathVariable Long id) {
        Perro perro = perroRepository.findById(id).orElse(null);
        if (perro == null) {
            return ResponseEntity.notFound().build();
        }
        perroRepository.delete(perro);
        return ResponseEntity.noContent().build();
    }
}
