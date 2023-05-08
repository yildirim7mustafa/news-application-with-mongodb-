package com.example.news;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@Document
public class News {

    @Id
    private String id;

    private Categories categories;

    @Indexed(unique = true)
    private String subject;

    private String header;

    private String paragraphFirst;

    private String photograph;

    private String paragraphSecond;

    private Address address;

    private Author author;

    private LocalDateTime created;

    public News(Categories categories, String subject, String header, String paragraphFirst, String photograph, String paragraphSecond, Address address, Author author, LocalDateTime created) {
        this.categories = categories;
        this.subject = subject;
        this.header = header;
        this.paragraphFirst = paragraphFirst;
        this.photograph = photograph;
        this.paragraphSecond = paragraphSecond;
        this.address = address;
        this.author = author;
        this.created = LocalDateTime.now();
    }
}
