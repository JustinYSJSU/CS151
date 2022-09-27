/**
 @author: Justin Yamamoto
 @date: 9/6/2022

 This is part of exercise 5 of cs151 hw1 with professor newton
 This implements the Dog class
*/

public class Dog extends Animal implements Domesticated
{
  private String type;
  private String name;
  private int age; 
  private String gender;
  private String environment;
  private int speed;

  /**
   Constructor for the Dog object

   @param type the type of dog
   @param name the name of the dog
   @param age the age of the dog
   @param gender the gender of the dog
   @param environment where the dog lives
   @param speed how fast the dog is (mph)

  */
  public Dog(String type, String name, int age, String gender, String environment, int speed)
  {
     super(type, name, age, gender, environment, speed);
  }

  /**
   Implements the walk() method from the Domesticated interface
  */
  @Override
  public void walk(){System.out.println("Walking");}

  /**
   Implements the greetHuman() method from the Domesticated inferface
  */
  @Override
  public void greetHuman(){System.out.println("Greeting human");}

  /**
   Dog specific method. allows it to bark
  */
  public void bark(){System.out.println("Bark");}

}
