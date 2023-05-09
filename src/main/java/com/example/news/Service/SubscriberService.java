package com.example.news.Service;

import com.example.news.Entity.Subscribers;
import com.example.news.Repository.SubscribersRepository;
import lombok.AllArgsConstructor;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

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

    public List<String> getAllActiveEmails() {
        List<Subscribers> activeSubscribers = subscribersRepository.findByIsActiveTrue();
        return activeSubscribers.stream().map(Subscribers::getEmail).collect(Collectors.toList());
    }

    public Subscribers addSub(Subscribers subs){
        return subscribersRepository.save(subs);
    }
    public void deleteSub(String id){
        subscribersRepository.deleteById(id);
    }

    public void updateIsActive(String email, boolean isActive) {
        Subscribers subscriber = subscribersRepository.findByEmail(email);
        subscriber.updateIsActive(isActive);
        subscribersRepository.save(subscriber);
    }

}
