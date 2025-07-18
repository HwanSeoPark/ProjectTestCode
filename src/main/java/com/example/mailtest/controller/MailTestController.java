package com.example.mailtest.controller;

import com.example.mailtest.service.MailTestService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/mail")
@RequiredArgsConstructor
public class MailTestController {

    @Autowired
    private final MailTestService mailTestService;

    @PostMapping("/test")
    public String testMail(@RequestParam String to) {
        mailTestService.sendTestMail(to);
        return "메일이 [" + to + "] 로 전송되었습니다.";
    }
}
