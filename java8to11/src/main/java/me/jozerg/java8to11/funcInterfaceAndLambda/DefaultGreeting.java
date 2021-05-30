package me.jozerg.java8to11.funcInterfaceAndLambda;

public class DefaultGreeting implements GreetingInterface{

    String name;

    public DefaultGreeting(String name) {
        this.name = name;
    }

    @Override
    public void printName() {
        System.out.println(name);
    }

    @Override
    public String getName() {
        return this.name;
    }
}
