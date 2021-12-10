package com.savio.myapp.bookpurchaseservice.api;

import com.savio.myapp.bookpurchaseservice.model.Books;
import com.savio.myapp.bookpurchaseservice.repo.BooksRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class BookPurchaseApi {

    @Autowired
    private BooksRepo bookRepo;


    @PostMapping("/saveBook")
    public Books saveBook(@RequestBody final Books bo)
    {
        return bookRepo.save(bo);
        
    }
    

   
}
