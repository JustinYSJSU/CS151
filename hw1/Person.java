/**
 @author Justin Yamamoto
 @date 9/2/2022
 This is exercise #3 from HW1 of CS151 with Professor Newton
 This implements the Person class
*/

public class Person
{
  private String firstName;
  private String lastName;
  private int age;
  private int socialSecurityNumber;
  private String address;
  private String gender;
  private double weight;

  /**
   Constructor for the Person class
   Creates an instance of the Person class

   @param firstName the first name of the person
   @param lastName the last name of the person
   @param age the age of the person
   @param socialSecurityNumber the ssn of the person
   @param address the address of the person
   @param gender the gender of the person
   @param weight the weight of the person
  */
  public Person(String firstName, String lastName, int age, int socialSecurityNumber, String address, String gender, double weight)
  {
     this.firstName = firstName;
     this.lastName = lastName;
     this.age = age;
     this.socialSecurityNumber = socialSecurityNumber;
     this.address = address;
     this.gender = gender;
     this.weight = weight;
  }
  
  /*
   The toString() method for the person object
   returns a String representation

   @return a String representation of the person object
  */
  @Override
  public String toString()
  {
    return "Person " + "["+ this.firstName + ", " + this.lastName + ", " + this.age + 
           ", " + this.socialSecurityNumber + ", " + this.address + ", " + this.gender + 
           ", " + this.weight + "]";
  }

  /*
   Introduces the person, printing out all their attribute values

  */
  public void introduce()
  {
     System.out.println("First name: " + this.firstName + "\n" + "Last Name: " + this.lastName + "\n" + 
                        "Age: " + this.age + "\n" + "SSN: " + this.socialSecurityNumber + "\n" + 
                        "Address: " + this.address + "\n" + "Gender: " + this.gender + "\n" + 
                        "Weight: " + this.weight);
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

  /*
   Gets the socialSecurityNumber of a person

   @return the ssn of a person
  */
  public int getSocialSecurityNumber(){return this.socialSecurityNumber;}

  /*
   Sets the socialSecurityNumber of a person

   @param socialSecurityNumber the ssn of a person
  */
  public void setSocialSecurityNumber(int socialSecurityNumber){this.socialSecurityNumber = socialSecurityNumber;}

  /*
   Gets the address of a person
  
   @return the address of a person
  */
  public String getAddress(){return this.address;}

  /*
   Sets the address of a person

   @param address the address of a person
  */
  public void setAddress(String address){this.address = address;}

  /*
   Gets the gender of a person
   
   @return the gender of a person
  */
  public String getGender(){return this.gender;}

  /*
   Sets the gender of a person
   
   @param gender the gender of a person
  */
  public void setGender(String gender){this.gender = gender;}

  /*
   Gets the weight of a person

  @return the weight of a person
  */
  public double getWeight(){return this.weight;}

  /*
   Sets the weight of a person
 
   @param weight the weight of a person
  */
  public void setWeight(double weight){this.weight = weight;}
}

 
