package com.example.demo.Controller;

import com.example.demo.Obj.Customer;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
public class CustomerController {
    @GetMapping("/customer/{id}")
    public Customer getCustomer(@PathVariable("id") String id) {
        Customer customer = new Customer();
        customer.setId(id);
        customer.setName("Mr.ApplePie");
        customer.setGender("Male");
        return customer;
    }
}
