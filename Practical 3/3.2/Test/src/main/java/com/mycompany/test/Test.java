/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.test;

/**
 *
 * @author user
 */
public class Test {

   public static void main(String[] args) {
        // Creating an Employee object using the constructor
        Employee emp = new Employee("Sameera", 100000.0, 10000.0);

        // Printing employee details and bonus amount
        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Basic Salary: " + emp.getBasicSalary());
        System.out.println("Bonus: " + emp.getBonus());
        System.out.println("Bonus Amount: " + emp.calculateBonusAmount());
    }
}
