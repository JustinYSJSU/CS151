/**
 @author: Justin Yamamoto
 @date: 11/13/2022

 This is the Shape class for hw5 of cs151 with professor newton
*/
public abstract class Shape 
{
  private String type;
  /**
   Blank constructor for Shape class

  */
  public Shape()
  {
   
  }

  /**
   Computes the area of the given shape

   @return area of the shape;
  */
  public abstract double computeArea(); 

  /**
   Returns a String representation of the shape

   @return a String representation
  */
  public abstract String toString();
}
