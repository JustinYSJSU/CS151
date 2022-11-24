import java.util.Scanner;
/**
 author: Justin Yamamoto
 date: 11/23/2022

 This is Exercise 3 of hw9 for cs151 with professor newton
*/
public class IntToHex
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter an integer, and enter a non-integer to quit");
    while(in.hasNextInt())
    {
      int x = in.nextInt(); 
      System.out.println("HEX VALUE OF " + x + ": " + Integer.toHexString(x).toUpperCase());
    }
  }
}
