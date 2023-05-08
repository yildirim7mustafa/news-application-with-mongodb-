package com.example.news;

import lombok.AllArgsConstructor;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.data.mongodb.core.query.Query;

@Service
@AllArgsConstructor
public class SubscriberService {

    private final SubscribersRepository subscribersRepository;
    public List<Subscribers> getAllSubs(){
        return subscribersRepository.findAll();
    }

    public List<String> getAllEmails() {
        List<Subscribers> subscribers = subscribersRepository.findAll();
        return subscribers.stream().map(Subscribers::getEmail).collect(Collectors.toList());
    }
    public Subscribers addSub(Subscribers subs){
        return subscribersRepository.save(subs);
    }
    public void deleteSub(String id){
        subscribersRepository.deleteById(id);
    }


}
