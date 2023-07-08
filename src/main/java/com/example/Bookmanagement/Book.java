package com.example.Bookmanagement;

import org.springframework.beans.factory.annotation.Autowired;

public class Book {
    String bookname;
    int pages;
    String Author_name;

    Author author;

    public Book(String bookname, int pages, String author_name) {
        this.bookname = bookname;
        this.pages = pages;
        this.Author_name = author_name;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getAuthor_name() {
        return Author_name;
    }

    public void setAuthor_name(String author_name) {
        Author_name = author_name;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}
