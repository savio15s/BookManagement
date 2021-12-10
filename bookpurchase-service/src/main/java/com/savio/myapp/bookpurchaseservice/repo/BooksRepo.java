package com.savio.myapp.bookpurchaseservice.repo;

import com.savio.myapp.bookpurchaseservice.model.Books;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BooksRepo extends JpaRepository<Books,Integer> {

}
