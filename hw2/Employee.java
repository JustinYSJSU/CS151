/**
 @author: Justin Yamamoto
 @date: 9/29/2022

 This is the Employee class for cs151 hw2 with professor newton
*/

public abstract class Employee extends Person
{
  private int id;
  private String educationLevel;
  private boolean directDeposit;

  /**
   Blank Constructor for Employee
  
  */
  public Employee(){}

  /**
   Constructor for Employee

   @param firstName the firstName
   @param lastName the lastName
   @param age the age
   @param ssn the ssn
   @param address the address
   @param id the id
   @param educationLevel the education level
   @param directDeposity direct deposit preference

  */
  public Employee(String firstName, String lastName, int age, String ssn, Address address, int id, String educationLevel, boolean directDeposit)
  {
    super(firstName, lastName, age, ssn, address);
    this.id = id;
    this.educationLevel = educationLevel;
    this.directDeposit = directDeposit;
  }

  /**
   Sets the id

   @param id the id
  */
  public void setID(int id){this.id = id;}

  /**
   Gets the id
 
   @return the id
  */
  public int getID(){return this.id;}

  /**
   Set direct deposit status
  
   @param directDeposit the status
  */
  public void setDirectDeposit(boolean directDeposit){this.directDeposit = directDeposit;}

  /**
   get the direct deposit status

   @return the direct deposit status
  */
  public boolean getDirectDeposit(){return this.directDeposit;}


  /**
   set education level
  
   @param educationLevel the education level
  */
  public void setEducationLevel(String educationLevel){this.educationLevel = educationLevel;}

  /**
   get the direct education level

   @return the education level
  */
  public String getEducationLevel(){return this.educationLevel;}

  /**
   Return a String representation of the Employee
  
   @return a string representation of the Employee
  */
  @Override
  public String toString()
  {
    return "Employee" + "[" + this.getFirstName() + ", " + this.getLastName() + ", " + this.getAge() + ", " +  this.getSSN() + ", " +
            this.getAddress().toString() + ", " + this.id + ", " + this.educationLevel + ", " + this.directDeposit + "]";
  }
}
