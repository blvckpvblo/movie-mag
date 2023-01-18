package com.thepinkchannel.movie_mag.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.thepinkchannel.movie_mag.entities.MovieEntity;
import com.thepinkchannel.movie_mag.repositories.MovieRepository;

@Service
public class MovieServiceImpl implements MovieService {
    private final MovieRepository movieRepository;

    public MovieServiceImpl(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @Override
    public MovieEntity addMovie(MovieEntity movie) {
        return movieRepository.save(movie);
    }

    @Override
    public List<MovieEntity> getMovies() {
        return movieRepository.findAll();
    }

    @Override
    public MovieEntity getMovie(Long id) {
        return movieRepository.findById(id).get();
    }

    @Override
    public MovieEntity updateMovie(MovieEntity movie) {
        return movieRepository.save(movie);
    }

    @Override
    public void deleteMovie(Long id) {
        movieRepository.deleteById(id);
    }


}
