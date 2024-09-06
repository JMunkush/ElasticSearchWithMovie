package io.munkush.app.controller;


import io.munkush.app.elastic.EMovie;
import io.munkush.app.elastic.ElasticRepository;
import io.munkush.app.movie.Movie;
import io.munkush.app.repo.MovieRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/movies")
public class MovieController {
    private final MovieRepository movieRepository;
    private final ElasticRepository elasticRepository;

    @PostMapping
    public void save(@RequestBody Movie request){
        movieRepository.save(request);
    }


    @GetMapping("/search")
    public List<EMovie> searchByName(@RequestParam("query") String query) {
        return elasticRepository.findAllByNameContains(query);
    }

}
