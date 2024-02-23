package org.modernjava.lambdaexpression;

public class HelloWorldTradintional implements HelloWorldInterface
{
    @Override
    public String sayHello() {
        return "Hello World!!!";
    }

    public static void main(String[] args) {
        HelloWorldTradintional hello=new HelloWorldTradintional();
        System.out.println(hello.sayHello());
    }
}
