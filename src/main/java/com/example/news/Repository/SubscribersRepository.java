package com.example.news.Repository;

import com.example.news.Entity.Subscribers;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;


public interface SubscribersRepository extends MongoRepository<Subscribers,String> {
    List<Subscribers> findAll();
    List<Subscribers> findByIsActiveTrue();

    Subscribers findByEmail(String email);

}
