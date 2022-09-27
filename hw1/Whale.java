/**
 @author: Justin Yamamoto
 @date: 9/6/2022
 
 This is part of exercise 5 of cs151 hw1 with professor newton
 This implements the Whale class
*/

public class Whale extends Animal implements Swimmer
{
  private String type;
  private String name;
  private int age;
  private String gender;
  private String environment;
  private int speed;

  /**
   Constructor for the animal class
   @param type the type of animal
   @param name the name of the animal
   @param age the age of the animal
   @param gender the gender of the animal
   @param environment where the animal lives
   @param speed how fast the animal is (mph)
  */
  public Whale(String type, String name, int age, String gender, String environment, int speed)
  {
    super(type, name, age, gender, environment, speed);
  }

  /**
   Implements the swim() method from the Swimmer interface
  */
  public void swim(){System.out.println("Swimming");}
}
