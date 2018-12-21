package com.example.demo.Services;

import com.example.demo.Repositories.BookRepository;
import com.example.demo.model.Book;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BookService {
    @Autowired
    BookRepository bookRepository;

    public List<Book> findAll()
    {
        return bookRepository.findAll();
    }

    public Book bookSave(Book book)
    {
        return bookRepository.save(book);
    }

    public Book findBookId(Integer id)
    {
        return bookRepository.findBookById(id);
    }

    public void deleteBook(Integer Id)
    {
        Book book = bookRepository.findBookById(Id);
        try
        {
            bookRepository.delete(book);
        }
        catch (Exception exception)
        {
            System.out.print(exception.getMessage());
        }
    }
}
