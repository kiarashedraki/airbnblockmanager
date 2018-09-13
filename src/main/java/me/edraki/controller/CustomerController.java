package me.edraki.controller;

import me.edraki.entity.Customer;
import me.edraki.service.CustomerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private CustomerRepository customerRepository;

    @RequestMapping(value = "",method = RequestMethod.GET)
    public List<Customer> customers() {
        return  customerRepository.findAll();
    }

    @RequestMapping(value = "",method = RequestMethod.POST)
    public Customer addCustomer(@RequestBody Customer customer){
        return customerRepository.save(customer);
    }
}
