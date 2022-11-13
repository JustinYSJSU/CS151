/**
 author: Justin Yamamoto
 date: 11/13/2022
 
 This is the Triangle class of hw5 for cs151 with professor newton
*/

public class Triangle extends Shape
{
  private double base;
  private double height;
  private String type;

  /**
   Constructor for Triangle class

   @param shape type
   @param base the base
   @param height the height
 */
 public Triangle(String type, double base, double height)
 {
   this.type = type;
   this.base = base;
   this.height = height;
 }


 /**
  Computes the area of a triangle (b*h)/2

  @return the area of the triangle
 */
 public double computeArea()
 {
   return (base * height) / 2;
 }

 /**
  Return string representation of the triangle

  @return string representation
 */
 public String toString()
 {
   return "Triangle: " + "["+ "Base=" +  this.base + ", Height=" +  this.height + ", Area=" + this.computeArea() + "]";
 }

 /**
  Get base

  @return base 
 */
 public double getBase(){return this.base;}

 /**
  Set base
 
  @param the base
 */
 public void setBase(double base){this.base = base;}

 /**
  Get height

  @return height
 */
 public double getHeight(){return this.height;}

 /**
  Set height

  @param the height
 */
 public void setHeight(double height){this.height = height;}
}
