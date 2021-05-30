package me.jozerg.java8to11.funcInterfaceAndLambda;

/**
 * - 추상 메소드가 하나만 있으면 함수형 인터페이스
 * - 다른 형태(static, default) 메소드가 있어도 함수형 메소드
 */
@FunctionalInterface
public interface RunSomething {

    int doIt(int number);

    static void printName() {
        System.out.println("joguk");
    }

    default void printAge(){
        System.out.println("29");
    }
}
