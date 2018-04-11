package com.nanda.lambda;

public class LambdaHelloWorld {
    interface HelloWorld {
        String hello(String name);
    }

    public static void main(String[] args) {
        HelloWorld helloWorld = name -> "Hello " + name;

   /*     HelloWorld helloWorld = new HelloWorld() {
            @Override
            public String hello(String name) {
                return "Hello " + name;
            }
        };*/
        System.out.println(helloWorld.hello("Joe"));
    }
}
