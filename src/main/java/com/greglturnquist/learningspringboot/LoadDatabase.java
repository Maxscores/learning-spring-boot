package com.greglturnquist.learningspringboot;

import reactor.core.publisher.Flux;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.beans.BeanProperty;

@Configuration // indicates source of beans
public class LoadDatabase {

    @Bean // indicates return value of init() is a bean
    CommandLineRunner init(ChapterRepository repository) {
        return args -> {
            Flux.just(
                    new Chapter("Quick Start with Java"),
                    new Chapter("Reactive Web with Spring Boot"),
                    new Chapter("...and more!"))
                    .flatMap(repository::save)
                    .subscribe(System.out::println);
            )
        }
    }
}
