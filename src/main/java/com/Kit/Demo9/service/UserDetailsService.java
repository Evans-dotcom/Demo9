package com.Kit.Demo9.service;

import com.Kit.Demo9.model.UserDetails;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

public interface UserDetailsService {

    public abstract ResponseEntity<UserDetails> saveUser(String data, MultipartFile file);

}
