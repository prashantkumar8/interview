package acko.testing.acko.controller;

import acko.testing.acko.model.Task;
import acko.testing.acko.repository.DbTesting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class HelloWorld {

    @Autowired
    private DbTesting dbTesting;

    @GetMapping(value = "/test")
    public String test() {
        Optional<Task> task=dbTesting.findById(10l);
        return "Hello World";
    }
}
