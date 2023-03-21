package com.learn.graphql.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.learn.graphql.model.Tutorial;

public interface TutorialRepository extends MongoRepository<Tutorial, String> {

}
