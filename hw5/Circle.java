/**
 author: Justin Yamamoto
 date: 11/13/2022

 This is the Circle class for hw5 of cs151 with professor newton
*/

public class Circle extends Shape
{
  private String type;
  private double radius;
  
  /**
   Constructor for Circle class

  @param type the type
  @param radius the radius
  */
  public Circle(String type, double radius)
  {
    this.type = type;
    this.radius = radius;
  }

  
  /**
   Compute area of the Circle

   @return area of the Circle
  */
  public double computeArea()
  {
    return Math.pow(radius, 2) * Math.PI;
  }

  /**
   Return String representation of Circle
 
   @return String representation of Circle
  */
  public String toString()
  {
    return "Circle [Radius=" + this.radius + ", Area=" + this.computeArea() + "]";
  }

  /**
   Get the radius of the Circle
   
   @return radius of the Circle
  */
  public double getRadius(){return this.radius;}

  /**
   Set the radius of the circle
   
   @param radius of the circle
  */
  public void setRadius(double radius){this.radius = radius;}
  
}
