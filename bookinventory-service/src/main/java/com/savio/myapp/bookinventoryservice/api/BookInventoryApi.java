package com.savio.myapp.bookinventoryservice.api;


import java.util.List;


import com.savio.myapp.bookinventoryservice.exception.BookNotFoundException;
import com.savio.myapp.bookinventoryservice.intercomm.BookClient;
import com.savio.myapp.bookinventoryservice.model.BookRegistery;
import com.savio.myapp.bookinventoryservice.model.Books;
import com.savio.myapp.bookinventoryservice.model.Register;
import com.savio.myapp.bookinventoryservice.repo.BooksRepo;
import com.savio.myapp.bookinventoryservice.service.BooksManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class BookInventoryApi {

    @Autowired
    private BookClient bookClient;

    @Autowired
    private BooksManager bService;

    @Autowired
    private BooksRepo bRepo;
    
    @RequestMapping("/getBooks")
    public List<Books> getBooks()
    {
        return bService.fetchBooks();
    }
    @DeleteMapping("/delete/{id}")
    public boolean deleteById(@PathVariable("id") final Integer id) {
        Books books = bRepo.findBybookId(id)
                .orElseThrow(() -> new BookNotFoundException("Book Not Found with id : " + id));
        bRepo.delete(books);
        return true;
    }
    @RequestMapping("/getLender/{bname}")
    public BookRegistery findBybookName(@PathVariable("bname") final String bName){
            BookRegistery br = new BookRegistery();
            Books books = bRepo.findBybookName(bName);
            br.setBookId(books.getBookId());
            br.setBookName(bName);
            br.setGenre(books.getGenre());
            br.setQuantity(books.getQuantity());
            List<Register> register =  bookClient.getLender(bName);
            br.setRegister(register);
            return br;

    }

   
}
