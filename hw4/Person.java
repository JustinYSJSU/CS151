/**
 @author: Justin Yamamoto
 @date: 10/20/2022

 This is the Person class of exercise 3 of hw4 for cs151 with professor newton
*/

public class Person
{
  private String firstName;
  private String lastName;
  private int age;

  /**
   Constructor for Person

   @param firstName the first name
   @param lastName the last name
   @param age the age 
  */
  public Person(String firstName, String lastName, int age)
  {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
  }

  /*
   Gets the first name of a person
   @return the first name of a person
  */
  public String getFirstName(){return this.firstName;}

  /*
   Sets the first name of a person
   
   @param firstName the first name of the person
  */
  public void setFirstName(String firstName){this.firstName = firstName;} 

  /*
   Gets the last name of a person
   @return the last name of a person
  */
  public String getLastName(){return this.lastName;}

  /*
   Sets the last name of a person
   @param lastName the last name of the person
  */
  public void setLastName(String lastName){this.lastName = lastName;}

  /*
   Gets the age of the person
   @return the age of the person
  */
  public int getAge(){return this.age;}

  /*
   Sets the age of the person
   @param age the age of the person
  */
  public void setAge(int age){this.age = age;}
}
