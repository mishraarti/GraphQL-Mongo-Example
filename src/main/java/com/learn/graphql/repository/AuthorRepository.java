package com.learn.graphql.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.learn.graphql.model.Author;

public interface AuthorRepository extends MongoRepository<Author, String> {

}
