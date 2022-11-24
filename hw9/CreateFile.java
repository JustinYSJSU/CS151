import java.io.*;
import java.util.*;

/**
 author: Justin Yamamoto
 date: 11/23/2022
 
 This is Exercise 1 of hw9 in cs151 with professor newton
*/
public class CreateFile
{
  public static void main(String[] args)
  {
    File results = null;
    FileWriter fr = null;
    Scanner input = new Scanner(System.in);
    try
    {
      results = new File("command_line_input.txt");
      fr = new FileWriter(results);
      System.out.println("Enter text. Enter @q to stop.");
      String in = input.nextLine();
      while(!(in.equals("@q")))
      {
        fr.write(in);
        fr.write("\n");
        fr.flush();
        in = input.nextLine();
      }
      fr.close();
    }
    catch(Exception e)
    {
      System.out.println(e);
    }
  }
}
