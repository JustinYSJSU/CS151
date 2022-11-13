import java.util.*;

/**
 author: Justin Yamamoto
 date: 11/13/2022

 This is the Shapes class for hw5 of cs151 with professor newton
*/
public class Shapes implements Runnable
{
  private ArrayList<Shape> shapeList;

  /**
   Constructor for Shape constructor

   @param shapeList the list of shapes
  */
  public Shapes()
  {
    shapeList = new ArrayList<Shape>();
  }

  /**
   Add a shape to the list
   
   @param s the shape to be added
  */
  public void add(Shape s)
  {
     shapeList.add(s);
  }

  /**
   Remove the specified shape from the list

  */
  public void remove(Shape s)
  {
    if(this.shapeList.indexOf(s) != -1)
    {
       this.shapeList.remove(this.shapeList.indexOf(s));
    }
  }

  /**
   Compute the area of each shape

  */
  synchronized public void compute()
  {
    for(Shape s : shapeList)
    {
      System.out.println(s.toString());
    }
  }

 /**
  Find shape with the smallest area in the list

  @return shape with the smallest area
 */
 synchronized public Shape min()
 {
   Shape min = shapeList.get(0);
   for(Shape s : this.shapeList)
   {  
     if(s.computeArea() < min.computeArea())
     {
        min = s;
     }
   }
   return min;
 }

 /**
  Find shape with the largest area in the list

  @return shape with the largest area
 */
 synchronized public Shape max()
 {
   Shape max = shapeList.get(0);
   for(Shape s : this.shapeList)
   {
     if(s.computeArea() > max.computeArea())
     {
       max = s;
     }
   }
   return max;
 }

 /** 
   run method from Runnable interface
  */
  public void run()
  {
    try
    {
      System.out.println("Thread " + Thread.currentThread().getId() + " starting");
      this.compute();
      this.min();
      this.max();
      System.out.println("Max: " + this.max().toString());
      System.out.println("Min: " + this.min().toString());
      System.out.println("Thread " + Thread.currentThread().getId() + " ending");
      System.out.println();
    }
    catch(Exception e)
    {
      System.out.println(e);
    }
  }

  /**
   start method from Runnable interface

  */
  public void start()
  {
    Thread threadObj = new Thread(this);
    threadObj.start();
  }

  /**
   Set the shape list

   @param shapeList the shape list
  */
  public void setShapeList(ArrayList<Shape> shapeList){this.shapeList = shapeList;}

  /**
   Get the shape list

   @return the shape list
  */
  public ArrayList<Shape> getShapeList(){return this.shapeList;}
}
