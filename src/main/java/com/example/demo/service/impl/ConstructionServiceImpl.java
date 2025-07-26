package com.example.demo.service.impl;

import com.example.demo.model.Construction;
import com.example.demo.repository.ConstructionRepository;
import com.example.demo.service.ConstructionService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class ConstructionServiceImpl implements ConstructionService {

    private final ConstructionRepository constructionRepository;

    public ConstructionServiceImpl(ConstructionRepository constructionRepository){
        this.constructionRepository = constructionRepository;
    }

    @Override
    public Construction findById(Integer id) {
        return constructionRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public Construction create(Construction constructionToCreate) {
        if ((constructionToCreate.getId()) != null && constructionRepository.existsById(constructionToCreate.getId())){
            throw new IllegalArgumentException("This construction Id already exists.");
        }
        return constructionRepository.save(constructionToCreate);
    }
}
