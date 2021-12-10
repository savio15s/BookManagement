package com.savio.myapp.bookinventoryservice.repo;

import java.util.List;
import java.util.Optional;



import com.savio.myapp.bookinventoryservice.model.Books;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BooksRepo extends JpaRepository<Books,Integer> {

    public List<Books> findAll();
    Optional<Books> findBybookId(Integer id);
    public Books findBybookName(String bookName);
    
}
