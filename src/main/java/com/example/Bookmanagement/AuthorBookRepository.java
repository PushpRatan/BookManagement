package com.example.Bookmanagement;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class AuthorBookRepository {

    Map<String, Book> BooksDB = new HashMap<>();
    Map<String, Author> AuthorsDB = new HashMap<>();



    public String addbook(Book book) {
        if(BooksDB.containsKey(book.getBookname())){
            return "Book Already Present";
        }
        BooksDB.put(book.getBookname(), book);
        return "Book Added Successfully";
    }

    public String addAuthor(Author author) {
        if(AuthorsDB.containsKey(author.getName())){
            return "Author already present";
        }
        AuthorsDB.put(author.getName(), author);
        return "Author added successfully";
    }

    public String connectAuthor() {
        for(String key : BooksDB.keySet()){
            Book book = BooksDB.get(key);
            Author author = AuthorsDB.get(book.getAuthor_name());
            book.setAuthor(author);
            System.out.println(book.getAuthor_name());
        }
        return "Connecting Authors completed";
    }


    public List<Author> filter(int age, int rating) {
        List<Author> list = new ArrayList<>();
        for(String key : AuthorsDB.keySet()){
            Author author = AuthorsDB.get(key);
            if(author.getAge()<age && author.getRating()>rating){
                list.add(author);
            }
        }
        return list;
    }


    public String updatePages(String bookname, int pages) {
        if(BooksDB.containsKey(bookname)){
            BooksDB.get(bookname).setPages(pages);
            return "Pages Updated";
        }
        return "Book not present";
    }

    public List<Book> booksFilter(int rate) {
        List<Book> bookAuthors = new ArrayList<>();
        for(String key : BooksDB.keySet()){
            bookAuthors.add(BooksDB.get(key));
        }
        return bookAuthors;
    }
}
