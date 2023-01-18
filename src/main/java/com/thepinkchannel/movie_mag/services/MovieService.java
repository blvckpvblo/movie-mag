package com.thepinkchannel.movie_mag.services;

import java.util.List;

import com.thepinkchannel.movie_mag.entities.MovieEntity;

public interface MovieService {
    MovieEntity addMovie(MovieEntity movie);
    List<MovieEntity> getMovies();
    MovieEntity getMovie(Long id);
    MovieEntity updateMovie(MovieEntity movieEntity);
    void deleteMovie(Long id);
}
