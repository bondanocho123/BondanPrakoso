package com.example.demo.Repositories;

import com.example.demo.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

    @Query("SELECT b FROM Book b WHERE b.id = :id")
    Book findBookById(@Param("id") Integer id) ;

    @Query("SELECT b FROM Book b WHERE b.id = :bookName")
    Book findBookByName(@Param("bookName") String bookName) ;

    @Query("SELECT b.bookAuthor FROM Book b WHERE b.id = :bookName")
    String findBookByNameOutputAuthor (@Param("bookName") String bookName) ;
}
