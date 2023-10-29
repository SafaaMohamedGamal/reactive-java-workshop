package io.javabrains.reactiveworkshop.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.time.Duration;

@RestController
public class ReactiveController {
    @GetMapping("/demo")
    public Mono<String> getMessage() {
        return getHello().zipWith(getName())
                .map(value -> value.getT1() + value.getT2());
    }

    private Mono<String> getHello() {
        return Mono.just("Hello ").delayElement(Duration.ofSeconds(5));
    }

    private Mono<String> getName() {
        return Mono.just("Safaa!").delayElement(Duration.ofSeconds(6));
    }
}
