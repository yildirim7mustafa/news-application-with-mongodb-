package com.example.news;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@Document
public class Subscribers {
    @Id
    private String id;
    @Indexed(unique = true)
    private String email;
    private String firstName;
    private String lastName;
    private String city;
    private boolean isActive;
    private LocalDateTime created;

    public Subscribers(String email, String firstName, String lastName, String city, boolean isActive, LocalDateTime created) {
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.isActive = true;
        this.created = LocalDateTime.now();
    }


}
