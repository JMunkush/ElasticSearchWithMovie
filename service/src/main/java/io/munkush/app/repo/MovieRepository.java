package io.munkush.app.repo;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import io.munkush.app.model.Movie;

import java.util.List;

public interface MovieRepository extends ElasticsearchRepository<Movie, String> {
    List<Movie> findAllByNameContains(String name);
    List<Movie> findAllByDescription(String description);
}
