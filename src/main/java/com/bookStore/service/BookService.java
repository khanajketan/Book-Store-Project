package com.bookStore.service;

import com.bookStore.entity.Book;
import com.bookStore.repository.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class BookService {
    @Autowired
    private BookRepo bRepo;

    @Autowired
    private MyBookService myBookService;
    public void save(Book b){
        bRepo.save(b);
    }
    public List<Book> getAllBooks(){
        return bRepo.findAll();
    }
    public void getBookById(int id){
        Book b = bRepo.findById(id).get();
        myBookService.saveToMYBook(b);
    }
}
