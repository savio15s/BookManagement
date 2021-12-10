package com.savio.myapp.bookinventoryservice.model;

import java.util.List;

public class BookRegistery {

    private Integer bookId;
    
    private Integer quantity;
    private String bookName;
    private String genre;
    private List<Register> register;
    public Integer getBookId() {
        return bookId;
    }
    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }
    public Integer getQuantity() {
        return quantity;
    }
    public void setQuantity(Integer quantity) {
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
    public List<Register> getRegister() {
        return register;
    }
    public void setRegister(List<Register> register) {
        this.register = register;
    }
    @Override
    public String toString() {
        return "BookRegistery [bookId=" + bookId + ", bookName=" + bookName + ", genre=" + genre + ", quantity="
                + quantity + ", register=" + register + "]";
    }
    
    
}
