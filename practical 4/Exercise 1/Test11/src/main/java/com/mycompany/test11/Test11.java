/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.test11;

/**
 *
 * @author user
 */
public class Test11 {

    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.setEmpID(10);
        e1.setEmpName("Mr. Bogdan");
        e1.setEmpDesignation("Software Engineer");

        Employee e2 = new Employee();
        e2.setEmpID(11);
        e2.setEmpName("Ms. Bird");
        e2.setEmpDesignation("Data Engineer");

        System.out.println("Employee ID: " + e1.getEmpID());
        System.out.println("Employee Name: " + e1.getEmpName());
        System.out.println("Employee Designation: " + e1.getEmpDesignation());

        System.out.println("Employee ID: " + e2.getEmpID());
        System.out.println("Employee Name: " + e2.getEmpName());
        System.out.println("Employee Designation: " + e2.getEmpDesignation());
    }
}
