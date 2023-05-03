package com.bookStore.controller;

import com.bookStore.entity.Book;
import com.bookStore.entity.MyBooks;
import com.bookStore.service.BookService;
import com.bookStore.service.MyBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class BookController {
    @Autowired
    private BookService service;
    @Autowired
    private MyBookService myBookService;
    @GetMapping("/")
    public String home(){
        return "home";
    }
    @GetMapping("/registerbook")
    public String bookRegister(){
        return "registerBook";
    }
    @GetMapping("/availablebooks")
    public ModelAndView getAllBooks(){
        List<Book> list = service.getAllBooks();
        return new ModelAndView("availableBooks","book", list);
    }
    @GetMapping("/mybooks")
    public ModelAndView myBooks(){
        List<MyBooks> list = myBookService.getAllBooks();
        return new ModelAndView("myBooks","mybook", list);
    }


    @PostMapping("/save")
    public String addBook(@ModelAttribute Book b){
        service.save(b);
        return "redirect:/availablebooks";
    }
    @RequestMapping("addBookToMyBooks/{id}")
    public String getBookById(@PathVariable("id")int id){

        service.getBookById(id);
        return "redirect:/mybooks";
    }

    @RequestMapping("removeBookById/{id}")
    public String removeBookById(@PathVariable("id")int id){
        myBookService.deleteBookById(id);
        return "redirect:/mybooks";
    }
}
