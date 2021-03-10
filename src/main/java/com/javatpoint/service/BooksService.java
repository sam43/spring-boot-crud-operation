package com.javatpoint.service;

import java.util.ArrayList;
import java.util.List;

import com.javatpoint.repository.BookRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.javatpoint.model.Books;
import com.javatpoint.repository.BooksRepository;

//defining the business logic
@Service
public class BooksService {

    @Autowired
    BookRepositoryImpl booksRepository;

    //BooksRepository booksRepository;
    //BooksRepositoryImpl booksRepository;

    //getting all books record by using the method findaAll() of CrudRepository
    public List<Books> getAllBooks() {
        return (List<Books>) booksRepository.findAll();
    }

    //getting a specific record by using the method findById() of CrudRepository
    public Books getBooksById(int id) {
        return booksRepository.findById(id).get();
    }

    //saving a specific record by using the method save() of CrudRepository
    public void saveOrUpdate(Books books) {
        booksRepository.save(books);
    }

    //deleting a specific record by using the method deleteById() of CrudRepository
    public void delete(int id) {
        booksRepository.deleteById(id);
    }

    //updating a record
    public void update(Books books, int bookid) {
        booksRepository.save(books);
    }

    // get filtered book list

    public void getFilteredBooksBy(int minPrice, int maxPrice) {
        booksRepository.filteredBooks(minPrice, maxPrice);
    }
}