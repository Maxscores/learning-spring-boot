package com.greglturnquist.learningspringboot;

import lombok.Data;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data // adds getters, setters, toString(), equals(), and hashCode()
@Document // indicates this is suitable for storing in a MongoDB
public class Chapter {
    @Id // primary key
    private String id;
    private String name;

    public Chapter(String name) {
        this.name = name;
    }
}
