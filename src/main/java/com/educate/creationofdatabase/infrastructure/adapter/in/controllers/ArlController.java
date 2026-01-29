package com.educate.creationofdatabase.infrastructure.adapter.in.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educate.creationofdatabase.application.services.ArlService;
import com.educate.creationofdatabase.domain.model.Arl;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/arl")
public class ArlController {
    private final ArlService service;

    public ArlController(ArlService service) {
        this.service = service;
    }
    
    @GetMapping
    public ResponseEntity<List<Arl>> list() {
        return ResponseEntity.ok(service.list());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Arl> getById(@PathVariable Long id) {
        return service.findById(id)
            .map(ResponseEntity::ok)
            .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<?> create(@Valid @RequestBody Arl arl, BindingResult result) {
        if (result.hasFieldErrors()) {
            return validation(result);
        }
        return ResponseEntity.ok(service.create(arl));
    }
    @PutMapping("/{id}")
    public ResponseEntity<?> update(@Valid @PathVariable Long id, @RequestBody Arl arl, BindingResult result) {
        if (result.hasFieldErrors()) {
            return validation(result);
        }
        return service.update(id, arl)
            .map(ResponseEntity::ok)
            .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
         Optional<Arl> arlOptional = service.delete(id);
        if (arlOptional.isPresent()) {
            return ResponseEntity.ok(arlOptional.orElseThrow());
        }
        return ResponseEntity.notFound().build();
    }
     
    private ResponseEntity<?> validation(BindingResult result) {
        Map<String, String> errors = new HashMap<>();

        result.getFieldErrors().forEach(err -> {
            errors.put(err.getField(), "El campo " + err.getField() + " " + err.getDefaultMessage());
        });
        return ResponseEntity.badRequest().body(errors);
    }
}
