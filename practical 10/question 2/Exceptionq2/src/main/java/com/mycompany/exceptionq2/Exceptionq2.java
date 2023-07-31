/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exceptionq2;

/**
 *
 * @author user
 */
public class Exceptionq2 {

    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};

        try {
            int index=6; // Change the index value to test different cases
            int element = numbers[index];
            System.out.println("Element at index " + index + ": " + element);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid index. The array size is " + numbers.length + ".");
        }
    }
}
