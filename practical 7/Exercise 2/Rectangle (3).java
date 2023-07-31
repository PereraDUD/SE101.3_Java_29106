
package com.mycompany.labsheet7e2;
public class Rectangle extends Shape
{
  private int length;
  private int width;
  public Rectangle(int l,int w)
  {
      length=l;
      width=w;           
  }
  double calculateArea()
  {
      return length*width;
  }
}
