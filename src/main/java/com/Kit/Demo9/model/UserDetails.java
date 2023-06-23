package com.Kit.Demo9.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "user_details")
public class UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String fileName;

    public UserDetails(String firstName, String lastName, String fileName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fileName = fileName;
    }

    public UserDetails(Long id,
                       String firstName, String lastName, String fileName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.fileName = fileName;
    }

    public UserDetails() {

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
}
