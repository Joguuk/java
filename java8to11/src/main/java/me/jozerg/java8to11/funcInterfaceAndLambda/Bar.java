package me.jozerg.java8to11.funcInterfaceAndLambda;

public interface Bar {

    /**
     * default method가 충돌될 경우 실제 인스턴스가 구현해야함
     */
    default void printNameUpperCase() {
        System.out.println();
    }

}
