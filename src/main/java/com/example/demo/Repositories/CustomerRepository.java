package com.example.demo.Repositories;

import com.example.demo.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

    @Query("SELECT c FROM tbl_customer c WHERE c.id = :id")
    Customer findCustomerById(@Param("id") Integer id) ;

    @Query("SELECT c FROM tbl_customer c WHERE c.id = :nama_customer")
    Customer  findCustomerName(@Param("nama_customer") String customerName) ;

}
