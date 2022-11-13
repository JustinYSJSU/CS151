/**
 author: Justin Yamamoto
 date: 11/13/2022

 This is the ShapeTest class of hw5 for cs151 with professor newton
*/

public class ShapeTest
{
  public static void main(String[] args)
  {
    Shapes s = new Shapes();
    s.add(new Triangle("Triangle", 1.2, 5.6));
    s.add(new Triangle("Triangle", 5.2, 10.2));
    s.add(new Circle("Circle", 4.0));
    s.add(new Circle("Circle", 10.0));
    s.add(new Rectangle("Rectangle", 10.0, 5.0));
    s.add(new Rectangle("Rectangle", 6.0, 7.0));
    s.add(new Hexagon("Hexagon", 5.0));
    s.add(new Hexagon("Hexagon", 7.0));

    for(int i = 0; i < 5; i++)
    {
      s.start(); //start() calls run() which will call compute(), min(), max()
    }
  }
}
