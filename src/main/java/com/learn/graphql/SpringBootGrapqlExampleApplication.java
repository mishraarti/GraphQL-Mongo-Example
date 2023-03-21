package com.learn.graphql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootGrapqlExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootGrapqlExampleApplication.class, args);
	}
	
	/*
	 * @Bean ApplicationRunner applicationRunner(AuthorRepository author,
	 * BookRepository bookRepo) {
	 * 
	 * return args->{ Author a = author.save(new Author(0, "jack")); Author a1 =
	 * author.save(new Author(0, "Jill")); bookRepo.saveAll(List.of( new Book("123",
	 * "Book of Clouds", "Kindle Edition", a, "Nov 2017"), new Book("124",
	 * "Cloud Arch & Engineering", "Orielly", a1, "Jan 2015"), new Book("125",
	 * "Java 9 Programming", "Orielly", a, "Dec 2016"))); }; }
	 */
}
