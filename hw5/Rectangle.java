/**
 author: Justin Yamamoto
 date: 11/13/2022
 
 This is the Rectangle class of hw5 for cs151 with professor newton
*/

public class Rectangle extends Shape
{
  private String type;
  private double length;
  private double width;

  /**
   Constructor for Triangle class

   @param base the base
   @param height the height
 */
 public Rectangle(String type, double length, double width)
 {
   this.type = type;
   this.length = length;
   this.width = width;
 }


 /**
  Computes the area of a triangle (b*h)/2

  @return the area of the triangle
 */
 public double computeArea()
 {
   return length * width;
 }

 /**
  Return string representation of the triangle

  @return string representation
 */
 public String toString()
 {
   return "Rectangle: " + "[Length="+ this.length + ", Width=" +  this.width + ", Area=" + this.computeArea() + "]";
 }

 /**
  Get length

  @return length
 */
 public double getLength(){return this.length;}

 /**
  Set length

  @param length
 */
 public void setLength(double length){this.length = length;}

 /**
  Get width

  @return width
 */
 public double getWidth(){return this.width;}

 /**
  Set width

  @param width the width
 */
 public double setWidth(double width){return this.width;}
}
