package com.example.news.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Author {
    private String firstName;
    private String lastName;
    private String email;
}
