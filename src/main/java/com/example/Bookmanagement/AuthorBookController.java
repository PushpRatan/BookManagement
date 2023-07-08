package com.example.Bookmanagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.security.PublicKey;
import java.util.List;

@RestController
public class AuthorBookController {

    @Autowired
    AuthorBookService authorBookService;

    @PostMapping("/add-book")
    public String addbook(@RequestBody Book book){
        return authorBookService.addbook(book);

    }

    @PostMapping("/add-author")
    public String addbook(@RequestBody Author author){
        return authorBookService.addAuthor(author);

    }

    @PutMapping("/connectAuthors")
    public String connectAuthor(){
        return authorBookService.connectAuthor();
    }

    @GetMapping("filterByAge&Rating/{age}/{rate}")
    public List<Author> filter(@PathVariable("age") int age, @PathVariable("rate") int rating){
        return authorBookService.filter(age, rating);
    }

    @PutMapping("/update/{book}/{pages}")
    public String updatePages(@PathVariable("book") String bookname, @PathVariable("pages") int pages){
        return authorBookService.updatePages(bookname, pages);
    }

    @GetMapping("/booksFilter/{rate}")
    public List<Book> booksFilter(@PathVariable("rate") int rate){
        return authorBookService.booksFilter(rate);
    }
}
