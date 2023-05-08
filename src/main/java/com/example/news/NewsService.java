package com.example.news;

import lombok.AllArgsConstructor;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class NewsService {

    private final NewsRepository newsRepository;

    public List<News> getAllNews(){
        return newsRepository.findAll();
    }

    public List<News> getLatestNews() {
        return newsRepository.findTop3ByOrderByCreatedDesc();
    }

    public News addNews(News news){
        return newsRepository.save(news);
    }

    public void deleteNews(String id){
        newsRepository.deleteById(id);
    }
}
