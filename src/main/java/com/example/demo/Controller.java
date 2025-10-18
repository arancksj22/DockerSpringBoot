package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/{num1}+{num2}")
    public int add(@PathVariable int num1, @PathVariable int num2) {
        return calcService.add(num1, num2);
    }

}
