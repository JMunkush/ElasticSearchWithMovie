package io.munkush.app.elastic;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "movies")
@Data
public class EMovie {
    @Id
    private Long id;
    private String name;
}
