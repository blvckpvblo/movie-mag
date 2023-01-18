package com.thepinkchannel.movie_mag.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thepinkchannel.movie_mag.entities.MovieEntity;

public interface MovieRepository extends JpaRepository<MovieEntity, Long> {
    
}
