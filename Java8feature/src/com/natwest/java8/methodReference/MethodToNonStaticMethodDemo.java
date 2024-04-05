package com.natwest.java8.methodReference;
interface Addition{
    int add(int a, int b);
}
public class MethodToNonStaticMethodDemo {
    public static void main(String[] args) {
        Calculation calculation = new Calculation();
        Addition addition = calculation::plus;

    }
}
