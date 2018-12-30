package com.example.demo.Services;


import com.example.demo.Repositories.CustomerRepository;
import com.example.demo.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    public List<Customer> findAll()
    {
        return customerRepository.findAll();
    }

    public Customer customerSave(Customer customer)
    {
        return customerRepository.save(customer);
    }

    public Customer findCustomerById(Integer id)
    {
        return customerRepository.findCustomerById(id);
    }

    public Customer findCustomerByName(String customerName)
    {
        return customerRepository.findCustomerName(customerName);
    }

    public void deleteCustomer(Integer Id) {
        Customer customer = customerRepository.findCustomerById(Id);
        try {
            customerRepository.delete(customer);
        }
        catch (Exception exception)
        {
            System.out.print(exception.getMessage());
        }
    }

}
