package com.natwest.java8.Annoymous;
@FunctionalInterface
interface Test{
    void phone();
    default void display(){
        System.out.println("this is a default");
    }
}
public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
        Test test = new Test() {
            @Override
            public void phone() {
                System.out.println("Thie is override function interface methods");
            }
        };
        test.display();
        test.phone();
    }
}
