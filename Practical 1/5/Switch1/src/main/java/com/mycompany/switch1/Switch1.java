/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.switch1;

/**
 *
 * @author user
 */
public class Switch1 {

   public static void main(String[] args) {
        char grade = 'D';
        switch (grade) {
            case 'A':
                System.out.println("Excellent!");
                break;
            case 'D':
                System.out.println("You passed");
            case 'F':
                System.out.println("Better try again");
                break;
            default:
                System.out.println("Invalid grade");
        }
        System.out.println("Your grade is " + grade);
    }
}
