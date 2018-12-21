package com.example.demo.Controller;

import com.example.demo.Services.BookService;
import com.example.demo.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/book")
public class BookController {
    @Autowired
    BookService bookService;

    @RequestMapping(value = {"","/"}, method = RequestMethod.GET)
    public String listBook(Model model)
    {
        model.addAttribute("books",bookService.findAll());
        return "books/list";
    }

    @RequestMapping(value = {"/add"},method = RequestMethod.POST)
    public String addBook(Model model)
    {
        Book book = new Book();
        model.addAttribute("Book", book);
        return "books/add";
    }

    @RequestMapping(value = {"/edit/{id}"},method = RequestMethod.GET)
    public String editBook(Model model, @PathVariable("id")Integer id)
    {
        Book book = new Book();
        model.addAttribute("Book",book);
        return "books/edit";
    }

    @RequestMapping(value = {"/delete/{id}"},method = RequestMethod.GET)
    public String deleteBook( @PathVariable("id") Integer id){
        bookService.deleteBook(id);
        return "redirect:/book" ;
    }



}
