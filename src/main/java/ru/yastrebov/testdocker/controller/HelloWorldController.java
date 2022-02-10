package ru.yastrebov.testdocker.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.yastrebov.testdocker.service.HelloWorldService;

@RestController
@RequiredArgsConstructor
@RequestMapping("hello")
public class HelloWorldController {

    private final HelloWorldService helloWorld;

    @GetMapping
    public String hello() {
        return helloWorld.hello();
    }
}
