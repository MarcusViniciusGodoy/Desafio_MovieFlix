package com.devsuperior.movieflix.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.movieflix.dto.ReviewDTO;
import com.devsuperior.movieflix.dto.ReviewInsertDTO;
import com.devsuperior.movieflix.services.ReviewService;

import jakarta.validation.Valid;

@RestController
@RequestMapping(value = "/reviews")
public class ReviewController {

    @Autowired
    private ReviewService service;

    @PostMapping
    @PreAuthorize("hasRole('ROLE_MEMBER')")
    public ResponseEntity<ReviewDTO> insert(@Valid @RequestBody ReviewInsertDTO dto) {
        ReviewDTO result = service.insert(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(result);
    }
}
