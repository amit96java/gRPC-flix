package com.grpcflix.movie.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.ToString;

@Data
@Entity
@ToString
@Table(name = "movie")
public class Movie {
    @Id
    @Column(name = "movie_id")
    private Integer id;
    private String title;
    @Column(name = "release_year")
    private int year;
    private double rating;
    private String genre;
}
