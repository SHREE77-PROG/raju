package com.example.ram.demoram.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.example.ram.demoram.entity.Book;

public class Bookservice {
    private static List<Book>list=new ArrayList<>();
static{
list.add(new Book(145,"shreedhar","naveen"));
list.add(new Book(147,"ragavendra","manjunath"));
list.add(new Book(149,"param","shivu"));
list.add(new Book(151,"nagu","nagratna"));
}


//get all book
public List<Book>getallbook(){

    return list;
}
//get book byid
public Book getbookbyid(int Id) 
{
  
   Book book=null;
   book =list.stream().filter(e->e.getId()==Id).findFirst().get();
    return book;
}
//adding book
public Book addbook(Book b){
   return b;
}
//delete book
public void deletebook(int bid){
list.stream().filter(book->book.getId()!=bid).collect(Collectors.toList());
}
}
