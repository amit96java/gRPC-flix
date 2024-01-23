package com.grpcflix.aggregator.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RecommendedMovie {
    private String title;
    private Integer year;
    private double rating;
}
