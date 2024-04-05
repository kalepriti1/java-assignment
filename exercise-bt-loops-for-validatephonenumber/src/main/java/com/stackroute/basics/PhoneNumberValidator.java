package com.stackroute.basics;

import java.util.Scanner;

public class PhoneNumberValidator {
    Scanner sc;
    public static void main(String[] args) {
        PhoneNumberValidator phoneNumberValidator=new PhoneNumberValidator();
        int result= Integer.parseInt(String.valueOf(phoneNumberValidator.validatePhoneNumber(phoneNumberValidator.getInput())));
        phoneNumberValidator.displayResult(result);

    }
    public String getInput() {
        Scanner sc=new Scanner(System.in);
        System.out.println("entre string");
        String a = sc.next();
        return a;
    }
    public int validatePhoneNumber(String input) {
        if (input == null || input.isEmpty()) {
            return -1;
        }

        int countDigits = 0;
        int countDashes = 0;

        for (char ch : input.toCharArray()) {
            if (Character.isDigit(ch)) {
                countDigits++;
            } else if (ch == '-') {
                countDashes++;
            } else {
                return 0;
            }
        }

        if (countDigits == 10 && (countDashes+ countDigits==input.length())) {
            return 1;
        } else {
            return 0;
        }
    }

    public void displayResult(int result) {
        if (result== 1){
            System.out.println("valid phone number");
        }else if(result == -1){
            System.out.println("string is empty or null");
        }else
            System.out.println("phone number is not valid ");
    }
    public void closeScanner(){
        sc.close();
    }

}