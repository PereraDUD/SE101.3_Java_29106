
package com.mycompany.labsheet7e2;
public class Circle extends Shape
{
    private int radius;
    public Circle(int r)
  {
      radius=r;           
  }
  double calculateArea()
  {
      return Math.PI*radius*radius;
  }
}
