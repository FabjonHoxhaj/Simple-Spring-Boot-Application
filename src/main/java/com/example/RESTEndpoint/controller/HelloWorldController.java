package com.example.RESTEndpoint.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDate;

@RestController
public class HelloWorldController {

LocalDate localDate = LocalDate.now();

@GetMapping("/hallo")
public LocalDate helloWorld() {
return this.localDate;
}


}
