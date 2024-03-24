package com.sathya.orm.BookRepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.sathya.orm.Book;

public interface BookRepository extends JpaRepository<Book, Integer>{
        
	@Query("SELECT b FROM Book b WHERE b.name = :name AND b.author = :author")
	List<Book> findBooksByTitleAndAuthor(@Param("name") String name, @Param("author") String author);

}