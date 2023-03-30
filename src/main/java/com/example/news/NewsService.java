package com.example.news;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class NewsService {

    private final NewsRepository newsRepository;

    public List<News> getAllNews(){
        return newsRepository.findAll();
    }

    public News addNews(News news){
        return newsRepository.save(news);
    }

    public void deleteNews(String id){
        newsRepository.deleteById(id);
    }
}
