package org.example.sbdemo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class TestController {

      @GetMapping    
    //  @PostMapping
    public ResponseEntity<String> getText(@RequestParam(required = false) boolean show) {
//    public ResponseEntity<String> postText(@RequestParam(required = false) boolean show) {
        if (Boolean.TRUE.equals(show)) {
            return ResponseEntity.ok("\n This is test response! \n");
        } else {
            return ResponseEntity.ok("\n Params are not correct. use: //test?show=true \n");
//            return ResponseEntity.noContent().build();
        }
    }
}

