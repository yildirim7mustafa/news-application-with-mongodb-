package com.example.news;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/news/")
@AllArgsConstructor
public class NewsController {

    private final NewsService newsService;

    @GetMapping("getAll")
    public List<News> getAllNews(){
        return newsService.getAllNews();
    }

    @PostMapping("addNews")
    public ResponseEntity<News> addNews(@RequestBody News news){
        return new ResponseEntity<>(newsService.addNews(news), HttpStatus.CREATED);
    }

    @GetMapping("getTop3News")
    public List<News> getLatestNews() {
        return newsService.getLatestNews();
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<Void> deleteNews(@PathVariable("id") String id){
        newsService.deleteNews(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
