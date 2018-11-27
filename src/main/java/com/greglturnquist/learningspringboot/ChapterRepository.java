package com.greglturnquist.learningspringboot;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface ChapterRepository extends ReactiveCrudRepository<Chapter, String> {
    // we get methods: save, delete, deleteById, deleteAll, findById, findAll by extending ReactiveCrudRepo, which extends Repository
    // <Entity Type, Primary Key>
}
