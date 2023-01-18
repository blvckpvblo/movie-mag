package com.thepinkchannel.movie_mag.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.thepinkchannel.movie_mag.entities.MovieEntity;
import com.thepinkchannel.movie_mag.services.MovieService;

@RestController
public class MovieController {

    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }
    
    @PostMapping("/movie")
    public MovieEntity addMovie(@RequestBody @Valid MovieEntity movie) {
        return movieService.addMovie(movie);
    }

    @GetMapping("/movie")
    public List<MovieEntity> getMovies() {
        return movieService.getMovies();
    }
    
    @GetMapping("/movie/{id}")
    public MovieEntity getMovie(@PathVariable Long id) {
        return movieService.getMovie(id);
    }
    
    @PatchMapping("/movie")
    public MovieEntity updateMovie(@RequestBody @Valid MovieEntity movie) {
        return movieService.updateMovie(movie);
    }

    @DeleteMapping("/movie/{id}")
    public void deleteMovie(@PathVariable Long id) {
        movieService.deleteMovie(id);
    }
}
