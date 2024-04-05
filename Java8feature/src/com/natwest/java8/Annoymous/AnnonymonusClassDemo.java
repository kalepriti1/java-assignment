package com.natwest.java8.Annoymous;
class Parent {
    void phone(){
        System.out.println("samsung");
    }
}
public class AnnonymonusClassDemo {
    public static void main(String[] args) {
        Parent parent = new Parent(){
            void phone(){
                System.out.println("iphone");
            }
        }; parent.phone();


        System.out.println("=======without override====");
        Parent parent1 = new Parent();
        parent1.phone();
    }
}
