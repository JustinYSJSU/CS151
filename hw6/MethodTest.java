import java.util.*;
/**
 author: Justin Yamamoto
 date: 11/13/2022

 This is the MethodTest class for hw6 of cs151 with professor newton
*/
public class MethodTest
{
  public static void main(String[] args)
  {
    ArrayList<Integer> intList = new ArrayList<Integer>();
    intList.add(1);
    intList.add(2);
    intList.add(3);
    intList.add(4);
    intList.add(5);
    intList.add(6);

    ArrayList<String> stringList = new ArrayList<String>();
    stringList.add("A");
    stringList.add("B");
    stringList.add("C");
    stringList.add("D");
    stringList.add("E");

    ArrayList<Double> doubleList = new ArrayList<Double>();
    doubleList.add(1.0);
    doubleList.add(2.0);
    doubleList.add(3.0);
    doubleList.add(4.0);
    doubleList.add(5.0);
    doubleList.add(6.0);
    doubleList.add(7.0);
    doubleList.add(8.0);

   System.out.println(count(intList));
   System.out.println(count(stringList));
   System.out.println(count(doubleList));
  }

  private static <T> int count(ArrayList<T> a)
  {
     return a.size();
  }
}
