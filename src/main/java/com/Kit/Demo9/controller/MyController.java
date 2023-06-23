package com.Kit.Demo9.controller;
import com.Kit.Demo9.model.UserDetails;
import com.Kit.Demo9.service.UserDetailsImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/save")
public class MyController {

        private final UserDetailsImpl implementation;

        public MyController(UserDetailsImpl implementation) {
                this.implementation = implementation;
        }

//        public MyController(UserDetailsImpl implementation) {
//                this.implementation = implementation;
//        }

        @PostMapping
        public ResponseEntity<UserDetails> saveUser(@RequestPart("data")String data, @RequestPart("file") MultipartFile file){
            return implementation.saveUser(data, file);
        }
}

