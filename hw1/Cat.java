/**
 @author: Justin Yamamoto
 @date: 9/6/2022

 This is part of exercise 5 of cs151 hw1 with professor newton
 This implements the Cat class
*/

public class Cat extends Animal implements Domesticated, Scratcher
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
   public Cat(String type, String name, int age, String gender, String environment, int speed)
   {
     super(type, name, age, gender, environment, speed);
   }

   /**
    Implements the walk() method from the Domesticated interface
   */
   @Override
   public void walk(){System.out.println("Walking");}
  
   /**
    Implements the greetHuman() method from the Domesticated interface
   */
   @Override
   public void greetHuman(){System.out.println("Greeting human");}

   /**
    Implements the scratch() method from the Scratcher interface
   */
   @Override
   public void scratch(){System.out.println("Scratching");}
}
