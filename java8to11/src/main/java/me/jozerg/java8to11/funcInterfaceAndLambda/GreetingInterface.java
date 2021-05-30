package me.jozerg.java8to11.funcInterfaceAndLambda;

public interface GreetingInterface {

    void printName();

    /**
     * @ImplSpec 이 구현체는 파라미터를 대문자로 바꿔 출력한다.
     */
    default void printNameUpperCase() {
        System.out.println(getName().toUpperCase());
    }

    static void printAnyThing() {
        System.out.println("Greeting");
    }

    String getName();

}
