package io.javabrains.reactiveworkshop;

import java.io.IOException;

public class Exercise4 {

    public static void main(String[] args) throws IOException {

        // Use ReactiveSources.intNumberMono()

        // Print the value from intNumberMono when it emits
        ReactiveSources.intNumberMono().subscribe(value -> System.out.println(value),
                err -> System.out.println(err.getMessage()),
                () -> System.out.println("complete"));

        // Get the value from the Mono into an integer variable
        Integer value = ReactiveSources.intNumberMono().block();


        System.out.println("Press a key to end");
        System.in.read();
    }

}
