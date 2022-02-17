package ru.yastrebov.testdocker.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class HelloWorldService {

    @Scheduled(fixedDelay = 5000)
    public String hello() {
        log.debug("Method hello() - start");
        log.info("Method hello() - start");
        log.warn("Method hello() - start");
        log.error("Method hello() - start");

        String simple = "Hello, World!";
        System.out.println(simple);

        log.debug("Method hello() - end");
        log.info("Method hello() - end");
        log.warn("Method hello() - end");
        log.error("Method hello() - end");
        return simple;
    }
}
