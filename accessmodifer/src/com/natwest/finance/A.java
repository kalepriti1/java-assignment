package com.natwest.finance;

public class A {
    private int a = 1;
    int b = 2;
    protected  int c = 3;
    public int d = 4;

    public static void main(String[] args){
        A account = new A();
        System.out.println(account.a);
        System.out.println(account.b);
        System.out.println(account.c);
        System.out.println(account.d);
    }
}
