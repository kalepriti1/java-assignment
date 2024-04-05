package com.natwest.java8.builtinfunctioninterface;


import java.util.function.Function;

public class Task1_Function {
    public static void main(String[] args) {
        Function<Integer,String> function1 = (age) -> age>18 ? "eligible": "not eligible";
        System.out.println(function1.apply(1));
     }
}
