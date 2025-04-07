package com.ReverseNumberApplication.RevNum.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/api")
public class ReverseController {

	@GetMapping("/{number}")
	
	public String reverseNumber(@PathVariable int number) {
        int num = number;
        int rev = 0;

        while (number != 0) {
            int rem = number % 10;
            rev = rev * 10 + rem;
            number /= 10;
        }

        return "Reversed of " + num + " is: " + rev;
    }
}
