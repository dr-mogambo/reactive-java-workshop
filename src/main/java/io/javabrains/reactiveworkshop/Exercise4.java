package io.javabrains.reactiveworkshop;

import java.io.IOException;
import java.util.Optional;

public class Exercise4 {

    public static void main(String[] args) throws IOException {

        // Use ReactiveSources.intNumberMono()
        ReactiveSources.intNumberMono().subscribe(e -> System.out.println(e));

        // Print the value from intNumberMono when it emits
        // TODO: Write code here

        // Get the value from the Mono into an integer variable
        // TODO: Write code here
        Optional<Integer> numbeer = ReactiveSources.intNumberMono().blockOptional();

        numbeer.orElse(2);

        System.out.println("Press a key to end");
        System.in.read();
    }

}
