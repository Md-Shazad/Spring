package com.jpa.assignment3.jpaassignment3.manyToOne.repository;


import com.jpa.assignment3.jpaassignment3.manyToOne.entity.Author;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AuthorRepository extends CrudRepository<Author,Integer> {

}
