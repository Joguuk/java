package me.jozerg.java8to11.funcInterfaceAndLambda;

import java.util.Arrays;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

/**
 * 메소드 레퍼런스
 */
public class App {

    public static void main(String[] args) {
        Greeting greeting = new Greeting();

        /**
         * 스테틱 페노스 래퍼런스
         */
        UnaryOperator<String> hi = Greeting::hi;

        /**
         * 메소드 래퍼런스
         */
        UnaryOperator<String> hello =greeting::hello;

        /**
         * 파라미터가 없는 생성자 래퍼런스
         */
        Supplier<Greeting> newGreeting= Greeting::new;
        // get을 해야 실제 인스터가 만들어짐.
        newGreeting.get();

        /**
         * 파라미터가 있는 생성자 래퍼런스
         */
        Function<String, Greeting> jogukGreeting = Greeting::new;

        String[] names = {"joguk", "Teak", "Swan"};
        Arrays.sort(names, String::compareToIgnoreCase);

        System.out.println("Arrays.toString(names) = " + Arrays.toString(names));

        DefaultGreeting df = new DefaultGreeting("joguk");
        df.printName();
        df.printNameUpperCase();

        


    }
}
