package org.example.sbdemo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping
    public ResponseEntity<String> getText(@RequestParam boolean show) {
        if (Boolean.TRUE.equals(show)) {
            return ResponseEntity.ok("\n Thi is test response! \n");
        } else {
            return ResponseEntity.noContent().build();
        }
    }
}

