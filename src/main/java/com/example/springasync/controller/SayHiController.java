package com.example.springasync.controller;

import com.example.springasync.service.SayHiService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@Slf4j
public class SayHiController {
    SayHiService sayHiService;

    @GetMapping("/api/v1")
    public String sayHi() throws InterruptedException {
        sayHiService.doingOther();
        log.info("I should be printed first");
        return "Hey dad!";
    }

}
