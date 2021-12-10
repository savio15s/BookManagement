package com.savio.myapp.bookinventoryservice.service;


import java.util.List;

import javax.transaction.Transactional;

import com.savio.myapp.bookinventoryservice.model.Books;
import com.savio.myapp.bookinventoryservice.repo.BooksRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class BooksManagerImple implements BooksManager {
    
    @Autowired
    private BooksRepo repo;

    @Override
    public List<Books> fetchBooks(){
        return repo.findAll();
    }

    
}
