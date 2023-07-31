
package com.mycompany.labsheet7e2;
abstract class Shape 
{
    abstract double calculateArea();
    public void display()
    {
        System.out.println("Area "+calculateArea());
    }
    
}
