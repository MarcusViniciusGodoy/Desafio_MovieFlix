package com.devsuperior.movieflix.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.movieflix.dto.MovieCardDTO;
import com.devsuperior.movieflix.dto.MovieDetailsDTO;
import com.devsuperior.movieflix.dto.ReviewDTO;
import com.devsuperior.movieflix.entities.Movie;
import com.devsuperior.movieflix.entities.Review;
import com.devsuperior.movieflix.repositories.MovieRepository;
import com.devsuperior.movieflix.repositories.ReviewRepository;
import com.devsuperior.movieflix.services.exceptions.ResourceNotFoundException;

@Service
public class MovieService {

    @Autowired
    private MovieRepository repository;

    @Autowired
    private ReviewRepository reviewRepository;

    @Transactional(readOnly = true)
    public Page<MovieCardDTO> findAllPaged(Long genreId, Pageable pageable) {
        Page<Movie> page;
    
        if (genreId == 0) {
            page = repository.findAllOrdered(pageable);
        } else {
            page = repository.findByGenre(genreId, pageable); 
        }
        return page.map(MovieCardDTO::new);
    }

    @Transactional(readOnly = true)
    public MovieDetailsDTO findById(Long id) {
        Optional<Movie> obj = repository.findById(id);
        Movie entity = obj.orElseThrow(() -> new ResourceNotFoundException("Entity not found"));
        return new MovieDetailsDTO(entity);
    }

    @Transactional(readOnly = true)
    public List<ReviewDTO> findByMovieId(Long movieId) {
        List<Review> list = reviewRepository.findByMovieId(movieId);
        return list.stream().map(ReviewDTO::new).toList();
    }
}
