package com.natwest.java8.methodReference;
interface Utility{
    int cube(int num);
}

class Calculator{
    int findCube1(int num){
        return num*num*num;
    }
    static int findCube2(int num){
        return num*num*num;
    }
}
public class Task1 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println("using lamda");
        Utility utility1 = (int a) -> {
            return a*a*a;
        };
        System.out.println(utility1.cube(2));

        System.out.println("normal method");
        Utility utility2 = calculator::findCube1;
        System.out.println(utility2.cube(2));

        System.out.println("with static method");
        Utility utility3 = Calculator::findCube2;
        System.out.println(utility3.cube(2));

    }
}
