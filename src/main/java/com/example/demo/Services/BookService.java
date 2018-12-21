package com.example.demo.Services;

import com.example.demo.Repositories.BookRepository;
import com.example.demo.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
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

    public Book findBookById(Integer id)
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
