package com.natwest.java8.methodReference;
@FunctionalInterface
interface User{
    void greet();
}
class Employee{
    static void mygreeting(){
        System.out.println("employee greeting");
    }
}
public class MethodReferenceDemo1 {
    public static void main(String[] args) {
        //implementing using lamda expression
        User user = () -> {
            System.out.println("user greeting");
            System.out.println("thanks");
        };

        //method reference for the static method
        User user1 = Employee::mygreeting;
        user1.greet();

    }
}
