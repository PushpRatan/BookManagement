package com.example.Bookmanagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorBookService {

    @Autowired
    AuthorBookRepository authorBookRepository;

    public String addbook(Book book) {
        return authorBookRepository.addbook(book);
    }

    public String addAuthor(Author author) {
        return authorBookRepository.addAuthor(author);
    }

    public String connectAuthor() {
        return authorBookRepository.connectAuthor();
    }

    public List<Author> filter(int age, int rating) {
        return authorBookRepository.filter(age, rating);
    }

    public String updatePages(String bookname, int pages) {
        return authorBookRepository.updatePages(bookname, pages);
    }

    public List<Book> booksFilter(int rate) {
        return authorBookRepository.booksFilter(rate);
    }
}
