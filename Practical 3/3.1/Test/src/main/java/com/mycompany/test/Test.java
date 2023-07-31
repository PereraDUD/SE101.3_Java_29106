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
        Employee emp = new Employee();
        emp.setName("Kamal");
        emp.setAge(25);
        emp.setSalary(100000.0);

        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Employee Age: " + emp.getAge());
        System.out.println("Employee Salary: " + emp.getSalary());
    }
}
