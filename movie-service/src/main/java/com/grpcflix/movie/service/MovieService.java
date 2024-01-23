package com.grpcflix.movie.service;

import com.grpcflix.movie.repository.MovieRepository;
import com.vinsguru.grpcflix.movie.MovieDto;
import com.vinsguru.grpcflix.movie.MovieSearchRequest;
import com.vinsguru.grpcflix.movie.MovieSearchResponse;
import com.vinsguru.grpcflix.movie.MovieServiceGrpc;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;

@GrpcService
public class MovieService extends MovieServiceGrpc.MovieServiceImplBase {

    @Autowired
    private MovieRepository repository;

    @Override
    public void getMovies(MovieSearchRequest request, StreamObserver<MovieSearchResponse> responseObserver) {
        System.out.println("Genre is : "+request.getGenre());
        List<MovieDto> movieDtoList = this.repository.getMovieByGenreOrderByYearDesc(request.getGenre().toString())
                .stream()
                .map(movie -> MovieDto.newBuilder()
                        .setTitle(movie.getTitle())
                        .setYear(movie.getYear())
                        .setRating(movie.getRating()).build())
                .collect(Collectors.toList());

        MovieSearchResponse searchResponse = MovieSearchResponse.newBuilder().addAllMovie(movieDtoList).build();
        responseObserver.onNext(searchResponse);
        responseObserver.onCompleted();

    }
}
