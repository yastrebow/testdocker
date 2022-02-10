package ru.yastrebov.testdocker.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class HelloWorldService {

    public String hello() {
        log.debug("Method hello() - start");

        String simple = "Hello, World!";
        System.out.println(simple);

        log.debug("Method hello() - end");
        return simple;

    }
}
