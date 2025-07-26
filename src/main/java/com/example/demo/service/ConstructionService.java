package com.example.demo.service;

import com.example.demo.model.Construction;

public interface ConstructionService {
    Construction findById(Integer id);

    Construction create(Construction constructionToCreate);
}
