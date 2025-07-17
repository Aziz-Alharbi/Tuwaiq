package com.example.exercise_day_20.Controller;

import com.example.exercise_day_20.ApiResponse;
import com.example.exercise_day_20.model.Customer;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/v1/customer")

public class CustomerController {

    ArrayList<Customer> customers = new ArrayList<>();
    int id = 1;

    @GetMapping("/get")
    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    @PostMapping("/add")
    public ApiResponse addCustomer(@RequestBody Customer customer) {
        customer.setId(id++);
        customers.add(customer);
        return new ApiResponse("Customer added", 200);
    }

    @PutMapping("/update/{index}")
    public ApiResponse updateCustomer(@PathVariable int index, @RequestBody Customer customer) {
        customer.setId(customers.get(index).getId());
        customers.set(index, customer);
        return new ApiResponse("Customer updated", 200);
    }

    @DeleteMapping("/delete/{index}")
    public ApiResponse deleteCustomer(@PathVariable int index) {
        customers.remove(index);
        return new ApiResponse("Customer deleted", 200);
    }

    @PutMapping("/deposit/{index}/{amount}")
    public ApiResponse deposit(@PathVariable int index, @PathVariable double amount) {
        Customer c = customers.get(index);
        c.setBalance(c.getBalance() + amount);
        return new ApiResponse("Deposit successful", 200);
    }

    @PutMapping("/withdraw/{index}/{amount}")
    public ApiResponse withdraw(@PathVariable int index, @PathVariable double amount) {
        Customer c = customers.get(index);
        if (c.getBalance() < amount) {
            return new ApiResponse("Insufficient balance", 400);
        }
        c.setBalance(c.getBalance() - amount);
        return new ApiResponse("Withdraw successful", 200);
    }
}