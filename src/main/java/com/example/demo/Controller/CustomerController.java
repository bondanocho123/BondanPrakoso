package com.example.demo.Controller;


import com.example.demo.Repositories.CustomerRepository;
import com.example.demo.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
@RequestMapping("/customer")
public class CustomerController
{
    @Autowired
    CustomerRepository customerRepository;

    public String listCustomer(Model model){
        model.addAttribute("customers", customerRepository.findAll());
        return "customer/list";
    }

    @GetMapping("/insert")
    public String input(Model model) {
        model.addAttribute("Customers", new Customer() {
        });
        return "customer/input";
    }



    @PostMapping("/saveCustomer")
    public String saveCustomer(@Valid Customer customer, Model model)
    {
        customerRepository.save(customer);
        model.addAttribute("Customers", customerRepository.findAll());
        return "redirect:/customer";
    }

    @GetMapping("/edit/{id}")
    public String editCustomer(@PathVariable("id") Integer id, Model model) {
        Customer customer = customerRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid  Customer Id" + id));
        model.addAttribute("Customers", customer);
        return "customer/edit";
    }

    @GetMapping("/delete/{id}")
    public String deleteCustomer(@PathVariable("id") Integer id, Model model) {
        Customer customer = customerRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid Customer id" + id));
        customerRepository.delete(customer);
        return "redirect:/customer";
    }


    //Handling Date Error with converting string to date format
//    @InitBinder
//    protected void initBinder(WebDataBinder binder) {
//        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//        binder.registerCustomEditor(Date.class, new CustomDateEditor(
//                dateFormat, false));
//    }

}
