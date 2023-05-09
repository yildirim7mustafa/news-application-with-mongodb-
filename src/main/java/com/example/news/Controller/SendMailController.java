package com.example.news.Controller;

import com.example.news.Service.SendEmailService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/mailSender/")
@AllArgsConstructor
public class SendMailController {

    private final SendEmailService sendEmailService;

    @GetMapping("send")
    List<String> emailSender(){
        return sendEmailService.SendEmail();
    }
}
