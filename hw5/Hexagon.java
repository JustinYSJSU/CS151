/**
 author: Justin Yamamoto
 date: 11/13/2022
 
 This is the Hexagon class of hw5 for cs151 with professor newton
*/

public class Hexagon extends Shape
{
  private String type;
  private double side;

  /**
   Constructor for Hexgaon class

   @param type the type
   @param side the side
 */
 public Hexagon(String type, double side)
 {
   this.type = type;
   this.side = side;
 }


 /**
  Computes the area of a triangle (b*h)/2

  @return the area of the triangle
 */
 public double computeArea()
 {
    double three = 3.0;
    double cubeThree = Math.cbrt(three);
    cubeThree /=2;
    cubeThree *=3;
    return cubeThree * Math.pow(side, 2);
 }

 /**
  Return string representation of the triangle

  @return string representation
 */
 public String toString()
 {
   return "Hexagon: " + "[Side="+ this.side + ", Area=" + this.computeArea() + "]";
 }

 /**
  Get side

  @return side
 */
 public double getSide(){return this.side;}

 /**
  Set side

  @param side
 */
 public void setSide(double side){this.side = side;}
}
