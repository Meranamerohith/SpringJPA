package com.sathya.orm.BookClient;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.sathya.orm.Book;
import com.sathya.orm.BookRepository.BookRepository;
@Component
public class BookClient implements CommandLineRunner{
	
	
	@Autowired
	BookRepository bookRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		List<Book> books = bookRepository.findBooksByTitleAndAuthor("corejava","jamesgosling");
		
		books.forEach(book->System.out.println(book));
		
	
		
	}

}
