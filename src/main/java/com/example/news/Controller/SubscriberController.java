package com.example.news.Controller;

import com.example.news.Service.SubscriberService;
import com.example.news.Entity.Subscribers;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/subs/")
@AllArgsConstructor
public class SubscriberController {

    private final SubscriberService subscriberService;

    @GetMapping("getAll")
    public List<Subscribers> getAllSubs(){
        return subscriberService.getAllSubs();
    }

    @PostMapping("addSub")
    public ResponseEntity addSub(@RequestBody Subscribers sub){
        return new ResponseEntity(subscriberService.addSub(sub), HttpStatus.CREATED);
    }
    @GetMapping("getAllEmails")
    public List<String> getAllEmails() {
        return subscriberService.getAllEmails();
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<Void> deleteNews(@PathVariable("id") String id){
        subscriberService.deleteSub(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("active")
    public List<String> getAllActiveEmails() {
        return subscriberService.getAllActiveEmails();
    }

    @PutMapping("chActivity")
    public void updateIsActive(@RequestParam String email, @RequestParam boolean isActive) {
        subscriberService.updateIsActive(email, isActive);
    }
}
