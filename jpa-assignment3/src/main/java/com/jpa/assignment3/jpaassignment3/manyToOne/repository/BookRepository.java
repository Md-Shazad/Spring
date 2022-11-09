package com.jpa.assignment3.jpaassignment3.manyToOne.repository;


import com.jpa.assignment3.jpaassignment3.manyToOne.entity.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BookRepository extends CrudRepository<Book,Integer> {

}
