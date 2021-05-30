package me.jozerg.java8to11.funcInterfaceAndLambda;

import java.util.function.*;

public class Foo {

    public static void main(String[] args) {
        int baseNumber = 10;
        // 익명 내부 클래스 anonymous inner class
        RunSomething runSomething = number -> number + baseNumber;

        System.out.println("runSomething =  " + runSomething.doIt(1));

        /**
         * 02. Function interface
         */
        Plus10 plus10Apply = new Plus10();
        System.out.println("plus10Aplly = " + plus10Apply.apply(10));

        Function<Integer, Integer> plus10 = (n) -> n +  10;
        Function<Integer, Integer> multiply2 = (n) -> n*2;

        System.out.println("multiply2 = " + multiply2.apply(2));

        Function<Integer, Integer> multiply2AndPlus10 = plus10.compose(multiply2);
        System.out.println("multiply2AndPlus10 = " + multiply2AndPlus10.apply(2));

        Function<Integer, Integer> plus10AndThenMultiply2 = plus10.andThen(multiply2);
        System.out.println("plus10AndThenMultiply2 = " + plus10AndThenMultiply2.apply(2));

        /**
         * 03. Consumer, Supllier, Predicate
         */
        Consumer<Integer> printInteger = (i) -> System.out.println("i = " + i);
        printInteger.accept(10);

        Supplier<Integer> get10 = () -> 10;
        System.out.println("get10 = " + get10);

        Predicate<String> startsWithJoguk = (s) -> s.startsWith("joguk");
        Predicate<Integer> isEven = (i) -> i%2 == 0;

        /**
         * 04. 람다 표현식
         */
        Supplier<Integer> get12 = () -> 12;

        Foo foo = new Foo();
        foo.run();
    }

    private void run(){
        int baseNum = 10;

        // 로컬클래스
        class LocalClass {
            void printBaseNumber() {
                int baseNum = 11;
                System.out.println("baseNum = " + baseNum);
            }
        }

        // 익명 클래스
        Consumer<Integer> integerConsumer = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                int baseNum = 12;
                System.out.println("baseNum = " + baseNum);
            }
        };

        IntConsumer printInt = (i) -> {
            System.out.println("i + baseNum= " + i+ baseNum);
        };

        printInt.accept(10);

        /**
         * baseNum을 뒤에서 변경하게 되어도 effective fianl이 아니기 때문에 람다 표현식에서 컴파일 에러 발생
         */
        //baseNum++;
    }

}
