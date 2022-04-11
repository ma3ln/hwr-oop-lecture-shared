package hwr.oop.examples;

import java.util.Scanner;

public class HelloWorld {
    String storedName;
    HelloWorld(String name) {
        storedName = name;
    }

    String getOutputString(){
        return "Hello " + storedName;
    }
}