package io.javabrains.reactiveworkshop;

import java.io.IOException;
import java.util.List;

public class Exercise3 {

    public static void main(String[] args) throws IOException {

        // Use ReactiveSources.intNumbersFlux()
        List<Integer> numbers = ReactiveSources.intNumbersFlux().toStream().toList();
        // this is a blocking operation, where we first get all elements within the
        // stream and this is why this is called blocking.

        System.out.println("list is" + numbers);
        // Get all numbers in the ReactiveSources.intNumbersFlux stream
        // into a List and print the list and its size
        // TODO: Write code here

        System.out.println("Press a key to end");
        System.in.read();
    }

}
