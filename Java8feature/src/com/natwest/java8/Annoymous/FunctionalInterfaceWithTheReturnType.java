package com.natwest.java8.Annoymous;
interface Calculation2{
    int add(int a, int b);

}
public class FunctionalInterfaceWithTheReturnType {
    public static void main(String[] args) {
        Calculation2 cal = (a, b) ->{
            if (a>b) {
                return a;
            }else{
                return b;
            }
        };

    }
}
