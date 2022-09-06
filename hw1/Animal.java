/**
 @author: Justin Yamamoto
 @date: 9/6/2022
 
 This is part of exercise 5 for cs151 hw1 with Professor Newton
 This implements the Animal class
*/
public class Animal
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
  public Animal(String type, String name, int age, String gender, String environment, int speed)
  {
    this.type = type;
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.environment = environment;
    this.speed = speed;
  }

  /**
   Allows the animal to move
  */
  public void move(){System.out.println("Moving");}

  /**
   Allows the animal to make sound
  */
  public void sound(){System.out.println("Sound");}

  /**
   Allows the animal to eat
  */
  public void eat(){System.out.println("Eating");}

  /**
   Allows the animal to sleep
  */
  public void sleep(){System.out.println("Sleeping");}

  /**
   Returns a String representation of the Animal
  
   @return a String representation of the Animal
  */
  @Override
  public String toString()
  {
    return "Animal " + "[" + this.type + ", " + this.name + ", " + this.age + ", " + this.gender + ", "
            + this.environment +  ", " + this.speed + "]";
  }

  /**
   Gets the type of animal

   @return the type of animal
  */
  public String getType(){return this.type;}

  /**
   Sets the type of animal
  
   @param type the type of animal
  */
  public void setType(String type){this.type = type;}

  /**
   Gets the name of the animal
  
   @return the name of the animal
  */
  public String getName(){return this.name;}

  /**
   Sets the name of the animal

   @param name the name of the animal
  */
  public void setName(String name){this.name = name;}

  /**
   Gets the age of the animal
  
   @return the age of the animal
  */
  public int getAge(){return this.age;}

  /**
   Sets the age of the animal

   @param age the age of the animal
  */
  public void setAge(int age){this.age = age;}

  /**
   Gets the gender of the animal

   @return the gender of the animal
  */
  public String getGender(){return this.gender;}

  /**
   Sets the gender of the animal

   @param gender the gender of the animal
  */
  public void setGender(String gender){this.gender = gender;}

  /**
   Gets the environment of the animal

   @return the environment of the animal
  */
  public String getEnvironment(){return this.environment;}

  /**
   Sets the environment of the animal
   
   @param environment the environment of the animal
  */
  public void setEnvironment(String environment){this.environment = environment;}

  /**
   Gets the speed of the animal
  
   @return the speed of the animal
  */
  public int getSpeed(){return this.speed;}

  /**
   Sets the speed of the animal

   @param speed the speed of the animal
  */
  public void setSpeed(int speed){this.speed = speed;}
}
