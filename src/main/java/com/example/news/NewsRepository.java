package com.example.news;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface NewsRepository extends MongoRepository<News,String> {

    List<News> findTop3ByOrderByCreatedDesc();
}
