package com.example.demo.controller;

import com.example.demo.model.Construction;
import com.example.demo.service.ConstructionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/construction")
public class ConstructionController {
    private final ConstructionService constructionService;

    public ConstructionController(ConstructionService constructionService){
        this.constructionService=constructionService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Construction> findById(@PathVariable Integer id){
        var  construction = constructionService.findById(id);
        return ResponseEntity.ok(construction);
    }

    @PostMapping
    public ResponseEntity<Construction> create(@RequestBody Construction constructionToCreate){
        var  constructionCreated = constructionService.create(constructionToCreate);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(constructionCreated.getId())
                .toUri();
        return ResponseEntity.created(location).body(constructionCreated);
    }
}
