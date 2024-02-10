package com.hexaware.customer.springbatch.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hexaware.customer.springbatch.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Long> {

}
