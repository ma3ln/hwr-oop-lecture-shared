package hwr.oop.examples;

import org.junit.jupiter.api.Test;
import org.assertj.core.api.Assertions;

class HelloWorldTest {

    @Test
    void helloWorld() {
        System.out.println("Hello World");
    }

    @Test
    void HelloWorld(){
        HelloWorld helloWorld = new HelloWorld("World");
        String output = helloWorld.getOutputString();
        Assertions.assertThat(output).isEqualTo("Hello World");
    }

    @Test
    void HelloWorldRandomName_toGreetMe(){
        HelloWorld helloWorld = new HelloWorld("Marlon");
        String output = helloWorld.getOutputString();
        Assertions.assertThat(output).isEqualTo("Hello Marlon");
    }

    @Test
    void HelloWorldRandomName_toGreetStepfan(){
        HelloWorld helloWorld = new HelloWorld("Stepfan");
        String output = helloWorld.getOutputString();
        Assertions.assertThat(output).isEqualTo("Hello Stepfan");
    }

}