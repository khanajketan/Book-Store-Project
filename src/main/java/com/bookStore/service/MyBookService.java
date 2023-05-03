package com.bookStore.service;

import com.bookStore.entity.Book;
import com.bookStore.entity.MyBooks;
import com.bookStore.repository.MyBookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyBookService {
    @Autowired
    private MyBookRepo mbRepo;
    public void saveToMYBook(Book b){
        MyBooks mb = new MyBooks(b.getName(), b.getAuther(),b.getPrice());
        mbRepo.save(mb);
    }
    public List<MyBooks> getAllBooks(){
        return mbRepo.findAll();
    }

    public void deleteBookById(int id){
        mbRepo.deleteById(id);
    }

}
