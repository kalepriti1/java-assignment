package com.natwest.java8.builtinfunctioninterface;

import java.util.function.Function;

public class FunctionDemo1 {
    public static void main(String[] args) {
        Function<String,Integer> function = (t) -> t.length();
        System.out.println(function.apply("Priti kale"));
        Function<Integer,Integer> function1 = (a) ->  a*a*a;
        System.out.println(function1.apply(3));


    }
}
