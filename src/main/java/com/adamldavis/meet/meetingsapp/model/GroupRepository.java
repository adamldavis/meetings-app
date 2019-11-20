package com.adamldavis.meet.meetingsapp.model;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.UUID;

public interface GroupRepository extends ReactiveMongoRepository<Group, UUID> {

    Flux<Group> findAllByNameStartsWith(String name);

    Mono<Group> findFirstByName(String name);

}
