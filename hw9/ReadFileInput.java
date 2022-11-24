import java.io.*;
import java.util.Scanner;

/**
 author: Justin Yamamoto
 date: 11/23/2022

 This is Exercise 2 of hw9 in cs151 with professor newton
*/
public class ReadFileInput 
{
  public static void main(String[] args) throws FileNotFoundException
  {
    File f = null;
    FileReader fr = null;
    try
    {
      f = new File("./quote.txt");
      Scanner s = new Scanner(f);
      while(s.hasNextLine())
      {
        System.out.println(s.nextLine());
      }
    }
    catch(Exception e)
    {
      System.out.println(e);
    }
  }
}
