package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping(/{num1}/{num2})
    public String add(@PathVariable int num1, @PathVariable int num2) {
        int sum = num1 + num2;
        return "The sum of " + num1 + " and " + num2 + " is " + sum;
    }

}
