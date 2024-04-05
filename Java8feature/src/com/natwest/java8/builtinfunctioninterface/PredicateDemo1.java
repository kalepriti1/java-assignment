package com.natwest.java8.builtinfunctioninterface;

import java.util.function.Predicate;

public class PredicateDemo1 {
    public static void main(String[] args) {
        Predicate<Integer> p1 = (age) -> age>18;
        System.out.println(p1.test(8));

        Predicate<String> p2 = (name) -> name.equals("Priti");
        System.out.println(p2.test("Priti"));
    }

}
