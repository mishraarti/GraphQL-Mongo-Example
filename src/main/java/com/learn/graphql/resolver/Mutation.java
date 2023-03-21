package com.learn.graphql.resolver;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.learn.graphql.model.Author;
import com.learn.graphql.model.Tutorial;
import com.learn.graphql.repository.AuthorRepository;
import com.learn.graphql.repository.TutorialRepository;

@Component
public class Mutation implements GraphQLMutationResolver {
  private AuthorRepository authorRepository;
  private TutorialRepository tutorialRepository;

  @Autowired
  public Mutation(AuthorRepository authorRepository, TutorialRepository tutorialRepository) {
    this.authorRepository = authorRepository;
    this.tutorialRepository = tutorialRepository;
  }

  public Author createAuthor(String name, Integer age) {
    Author author = new Author();
    author.setName(name);
    author.setAge(age);

    authorRepository.save(author);

    return author;
  }

  public Tutorial createTutorial(String title, String description, String authorId) {
    Tutorial book = new Tutorial();
    book.setAuthorId(authorId);
    book.setTitle(title);
    book.setDescription(description);

    tutorialRepository.save(book);

    return book;
  }

  public boolean deleteTutorial(String id) {
    tutorialRepository.deleteById(id);
    return true;
  }

  public Tutorial updateTutorial(String id, String title, String description) throws Exception {
    Optional<Tutorial> optTutorial = tutorialRepository.findById(id);

    if (optTutorial.isPresent()) {
      Tutorial tutorial = optTutorial.get();

      if (title != null)
        tutorial.setTitle(title);
      if (description != null)
        tutorial.setDescription(description);

      tutorialRepository.save(tutorial);
      return tutorial;
    }

    throw new Exception("Not found Tutorial to update!");
  }

}
