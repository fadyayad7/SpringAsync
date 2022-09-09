package com.example.springasync.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import static java.lang.Thread.sleep;

@Service
@Slf4j
public class SayHiService {
    @Async
    public void doingOther() throws InterruptedException {
        sleep(10000);
        log.info("I was doing other");
    }

}
