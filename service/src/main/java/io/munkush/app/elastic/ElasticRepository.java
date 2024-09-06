package io.munkush.app.elastic;

import io.munkush.app.elastic.EMovie;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ElasticRepository extends ElasticsearchRepository<EMovie, Long> {

    List<EMovie> findAllByNameContains(String name);
}
