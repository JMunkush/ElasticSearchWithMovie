package io.munkush.app.controller;

import io.munkush.app.model.Movie;
import io.munkush.app.repo.MovieRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/movies")
public class MovieController {

    private final MovieRepository movieRepository;


    @PostMapping
    public void save(@RequestBody Movie request){
        movieRepository.save(request);
    }
    @GetMapping
    public Iterable<Movie> findAll(){
        return movieRepository.findAll();
    }

    @GetMapping("/search")
    public List<Movie> searchByName(@RequestParam("query") String query) {
        return movieRepository.findAllByNameContains(query);
    }

}
