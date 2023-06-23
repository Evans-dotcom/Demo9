package com.Kit.Demo9.service;

import com.Kit.Demo9.model.UserDetails;
import com.Kit.Demo9.repo.UserDetailsRepo;
import com.fasterxml.jackson.databind.json.JsonMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

@Service
public class UserDetailsImpl implements UserDetailsService {

    UserDetails userDetails = new UserDetails();
  private final   UserDetailsRepo userDetailsRepo;
    @Value("${file.path}")
    String filePath;

    public UserDetailsImpl(UserDetailsRepo userDetailsRepo) {
        this.userDetailsRepo = userDetailsRepo;
    }


    public ResponseEntity<UserDetails> saveUser(String data, MultipartFile file) {
        JsonMapper map = new JsonMapper();
        try {
            userDetails = map.readValue(data,UserDetails.class);
            file.transferTo(new File("C:\\Users\\emmanuel kimutai\\Desktop\\springboot\\Demo9\\src\\main\\resources\\ProfilePics\\" + file.getOriginalFilename()));
            userDetails.setFileName(file.getOriginalFilename());
            userDetailsRepo.save(userDetails);
        } catch (Exception e) {
            System.out.println(e);
        }

        return ResponseEntity.ok().body(userDetails);
    }
}
