package es.vuejsazure.workshop.demo.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/test", produces = "application/json")
public class TestController {

    @GetMapping
    public ResponseEntity<String> getMessage(){


        return new ResponseEntity<>("Hello 2", HttpStatus.OK);
    }

}
