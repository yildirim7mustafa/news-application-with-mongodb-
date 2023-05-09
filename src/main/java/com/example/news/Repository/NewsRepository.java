package com.example.news.Repository;

import com.example.news.Entity.News;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface NewsRepository extends MongoRepository<News,String> {

    List<News> findTop3ByOrderByCreatedDesc();
}
