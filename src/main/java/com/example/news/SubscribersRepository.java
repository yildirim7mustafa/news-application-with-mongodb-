package com.example.news;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;


public interface SubscribersRepository extends MongoRepository<Subscribers,String> {
    List<Subscribers> findAll();

}
