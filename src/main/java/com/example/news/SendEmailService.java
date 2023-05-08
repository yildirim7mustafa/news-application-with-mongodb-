package com.example.news;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class SendEmailService {
    private SubscriberService subscriberService;
    private NewsService newsService;

    public List<String> SendEmail(){
        List<String> messages = new ArrayList<>();
        List<String> emails = subscriberService.getAllEmails();
        List<News> news = newsService.getLatestNews();

        String news1 = news.get(0).getHeader() + " başlıklı "+ news.get(0).getSubject() + " konusu içeren mail, ";
        String news2 = news.get(1).getHeader() + " başlıklı "+ news.get(1).getSubject() + " konusu içeren mail, ";
        String news3 = news.get(2).getHeader() + " başlıklı "+ news.get(2).getSubject() + " konusu içeren mail gonderildi.";
        for(String mail: emails){
           String message = mail + " adresine " + news1 + news2 + news3;
           messages.add(message);
        }
        return messages;
    }
}
