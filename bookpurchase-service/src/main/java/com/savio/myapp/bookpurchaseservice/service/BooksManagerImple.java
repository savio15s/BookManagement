package com.savio.myapp.bookpurchaseservice.service;

import javax.transaction.Transactional;

import com.savio.myapp.bookpurchaseservice.model.Books;
import com.savio.myapp.bookpurchaseservice.repo.BooksRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class BooksManagerImple implements BooksManager {


     @Autowired
    private BooksRepo repo;

    @Override
    public void save(Books bo){

        repo.save(bo);
    }
}
