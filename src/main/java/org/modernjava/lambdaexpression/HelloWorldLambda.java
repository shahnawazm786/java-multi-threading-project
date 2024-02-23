package org.modernjava.lambdaexpression;

public class HelloWorldLambda {
    public static void main(String[] args) {
        HelloWorldInterface helloWorldInterface=()->{
            return "Hello World Lambda !!!!";
        };
        System.out.println(helloWorldInterface.sayHello());
    }
}
