package com.example.ram.demoram.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.ram.demoram.entity.Book;
import com.example.ram.demoram.service.Bookservice;

@RestController
public class Mycontroller {
    @Autowired
     private Bookservice bookservice;

 @GetMapping ("/book")  
 public List<Book>getbooks(){
    return this.bookservice.getallbook();
 }
   
   //getsingal book
@GetMapping("/book/{bookid}")
public Book getbook(@PathVariable ("bookid")int id)
{

   return this.bookservice.getbookbyid(id);
}
@PostMapping ("/book")
 public Book addbook(@RequestBody Book book)
 {
    Book b=this.bookservice.addbook(book);
    System.out.println(book);
    return(b);
}
@DeleteMapping("/book/{id}")
public void deletebook(@PathVariable("id")int bookid)
{
   this.bookservice.deletebook(bookid);
   
}
}
