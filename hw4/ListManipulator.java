import java.util.*;

/**
 author: Justin Yamamoto
 date: 10/20/2022

 This is exercise #1 of hw4 for cs151 with professor newton
*/

public class ListManipulator
{
  /**
   Sorts a given ArrayList of integers in either ascending or descending order

   @param myList the given ArrayList of integers
   @param ascending sort in ascending or descending order
  */
  public ArrayList<Integer> sort(ArrayList<Integer>  myList, boolean ascending)
  {
    if(ascending == true)
    {
       Collections.sort(myList);
       return myList;
    }
    Collections.sort(myList, Collections.reverseOrder());
    return myList;
  }

  /**
   Swaps the positions of the largest and smallest integers 
   in a given ArrayList

   @param myList the given ArrayList
  */
  public ArrayList<Integer> swapLargestSmallest(ArrayList<Integer> myList)
  {
    int minIndex = myList.indexOf(Collections.min(myList));
    int maxIndex = myList.indexOf(Collections.max(myList));

    int min = Collections.min(myList); 
    myList.set(minIndex, Collections.max(myList));
    myList.set(maxIndex, min);

    return myList;
  }

  /**
   Turns a given ArrayList into a sorted table
   The sorted table contains each unique value and how many times 
   it occurs
   
   @param myList the given ArrayList
  */
  public void table(ArrayList<Integer> myList)
  {
    Map<Integer, Integer> tm = new TreeMap(); 
    for(int i : myList)
    {
      if(tm.containsKey(i))
      {
         tm.put(i, tm.get(i) + 1);
      }
      else
      {
         tm.put(i, 1);
      }
    }

    for(int key : tm.keySet())
    {
      System.out.println("Key: " + key + ": " + "Value: " + tm.get(key));
    }
  }
}
