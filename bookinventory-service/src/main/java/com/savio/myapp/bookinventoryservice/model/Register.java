package com.savio.myapp.bookinventoryservice.model;

public class Register {

    private Integer pId;
    
    private String bookName;

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    @Override
    public String toString() {
        return "Register [bookName=" + bookName + ", pId=" + pId + "]";
    }
    
    
}
