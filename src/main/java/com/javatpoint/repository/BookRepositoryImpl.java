package com.javatpoint.repository;

import com.javatpoint.model.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BookRepositoryImpl implements BooksRepository {
    @Autowired
    BooksRepository booksRepository;


    @Override
    public void filteredBooks(int minPrice, int maxPrice) {

    }

    @Override
    public <S extends Books> S save(S s) {
        return null;
    }

    @Override
    public <S extends Books> Iterable<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Optional<Books> findById(Integer integer) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Integer integer) {
        return false;
    }

    @Override
    public Iterable<Books> findAll() {
        List<Books> books = new ArrayList<>();
        booksRepository.findAll().forEach(books::add);
        return books;
    }

    @Override
    public Iterable<Books> findAllById(Iterable<Integer> iterable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Integer integer) {

    }

    @Override
    public void delete(Books books) {

    }

    @Override
    public void deleteAll(Iterable<? extends Books> iterable) {

    }

    @Override
    public void deleteAll() {

    }
}
