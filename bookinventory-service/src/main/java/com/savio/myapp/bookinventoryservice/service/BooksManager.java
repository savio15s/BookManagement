package com.savio.myapp.bookinventoryservice.service;


import java.util.List;

import com.savio.myapp.bookinventoryservice.model.Books;



public interface BooksManager {
    
    List<Books> fetchBooks();
    
    
}
