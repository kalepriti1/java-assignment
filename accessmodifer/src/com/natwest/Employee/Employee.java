package com.natwest.Employee;

public class Employee {
    private int id;
    private String name;
    private int noOfDayPresent;
    private double salary;
    private String dept;


    public Employee(int id, String name, int noOfDayPresent, double salary, String dept) {
        this.id = id;
        this.name = name;
        this.noOfDayPresent = noOfDayPresent;
        this.salary = salary;
        this.dept = dept;
    }
    // Method to calculate total salary earned for the month
    public double calculateTotalSalaryeEarnedForThatMonth(){
        // Total salary earned = (per day salary * number of days present) + per day salary for the day of calculation
        return perDaySalary()*noOfDayPresent+perDaySalary();
    }

    // Method to calculate per day salary based on monthly salary
    private double perDaySalary() {
        return salary/30;
    }
    // Method to calculate bonus earned by the employee
    public double bonusEarnedForTheEmployee(){
        if (dept == "developer"){
            // 30% bonus for developers
            double bonus = salary*30/100;
            return bonus;
        } else if (dept == "manager") {
            // 50% bonus for managers
            double bonus = salary*50/100;
            return bonus;

        }else{
            // 10% bonus for other departments
            double bonus = salary*10/100;
            return bonus;
        }

    }
}
