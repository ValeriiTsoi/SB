package org.example.sbdemo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping
    public ResponseEntity<String> getText(@RequestParam boolean show) {
        if (show) {
            return ResponseEntity.ok("Thi is test response!");
        } else {
            return ResponseEntity.noContent().build();
        }
    }
}

