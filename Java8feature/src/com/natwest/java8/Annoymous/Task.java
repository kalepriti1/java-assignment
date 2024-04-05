package com.natwest.java8.Annoymous;
interface LargeNumber{
    String large(int a, int b, int c);
}
public class Task {
    public static void main(String[] args) {
        LargeNumber ln = (a,b,c) -> {
            if (a > b && a > c) {
                return "A is large";
            } else if (b > a && b > c) {
                return "B is large";
            } else if (c > a && c > b) {
                return "C is large";
            }else{
                return null;
            }
        };
        ln.large(4,6,3);

    }
}
