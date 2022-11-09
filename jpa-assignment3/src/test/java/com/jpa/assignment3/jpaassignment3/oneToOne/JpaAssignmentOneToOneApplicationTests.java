package com.jpa.assignment3.jpaassignment3.oneToOne;

import com.jpa.assignment3.jpaassignment3.oneToOne.entity.Address;
import com.jpa.assignment3.jpaassignment3.oneToOne.entity.Author;
import com.jpa.assignment3.jpaassignment3.oneToOne.entity.Book;
import com.jpa.assignment3.jpaassignment3.oneToOne.entity.Subject;
import com.jpa.assignment3.jpaassignment3.oneToOne.repository.AuthorRepository;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.AutoConfigureTestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;



import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@AutoConfigureTestEntityManager
class JpaAssignmentOneToOneApplicationTests {

	@Autowired
	AuthorRepository authorRepository;



	@Test
	void contextLoads() {
	}

	@Test
	@Order(value = 1)
	public void testCreate(){
		Address address = new Address("1","abc","a");
		Subject subject1 = new Subject("Java");
		Subject subject2 = new Subject("C++");
		Subject subject3 = new Subject("C#");

		Set<Subject> set = new HashSet<>();
		set.add(subject1);
		set.add(subject2);
		set.add(subject3);

		Book book1=new Book();
		book1.setBookName("Java Core in Easy Steps");





		Author author = new Author();
		author.setId(2);
		author.setName("Nafees");
		author.setAddress(address);
		author.setSubjects(set);
		author.setBook(book1);

		authorRepository.save(author);

	}

	@Test
	@Order(value=2)
	public void testGetData(){
		Optional<Author> byId = authorRepository.findById(1);
		if(byId.isPresent()){
			System.out.println(byId.get());
		}
	}
}
