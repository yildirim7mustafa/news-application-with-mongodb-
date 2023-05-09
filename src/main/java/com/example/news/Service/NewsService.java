package com.example.news.Service;

import com.example.news.Entity.News;
import com.example.news.Repository.NewsRepository;
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
