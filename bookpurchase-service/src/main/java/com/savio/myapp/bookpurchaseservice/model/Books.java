package com.savio.myapp.bookpurchaseservice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Books {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer bookId;
    
    private Integer quantity;
    private String bookName;
    private String genre;
    
    public Books(Integer quantity, String bookName, String genre) {
        this.quantity = quantity;
        this.bookName = bookName;
        this.genre = genre;
    }

    

    
    
    
    public int getBookId() {
        return bookId;
    }
    public void setBookId(int bookId) {
        this.bookId = bookId;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public String getBookName() {
        return bookName;
    }
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    @Override
    public String toString() {
        return "books [bookId=" + bookId + ", bookName=" + bookName + ", genre=" + genre + ", quantity=" + quantity
                + "]";
    }
    
}
