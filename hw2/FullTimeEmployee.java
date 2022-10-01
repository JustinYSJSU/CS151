/**
 @author Justin Yamamoto
 @date 9/29/2022

 This is the FullTimeEmployee class for hw2 of cs151 with professor newton
*/

public abstract class FullTimeEmployee extends Employee
{
  private double basePay;

  /**
   Blank constructor for a full time employee

  */
  public FullTimeEmployee(){}

  /**
   Constructor for a full time employee

   @param firstName the firstName
   @param lastName the lastName
   @param age the age
   @param ssn the ssn
   @param address the address
   @param id the id
   @param educationLevel the education level
   @param directDeposity direct deposit preference
   @param basePay the basePay of the employee
  */
  public FullTimeEmployee(String firstName, String lastName, int age, String ssn, Address address, int id, String educationLevel, boolean directDeposit, double basePay)
  {
     super(firstName, lastName, age, ssn, address, id, educationLevel, directDeposit);
     this.basePay = basePay;
  }

  /**
   Gets the base pay
   
   @return the base pay
  */
  public double getBasePay(){return this.basePay;}

  /**
   Sets the base pay

   @param basePay the base pay
  */
  public void setBasePay(double basePay){this.basePay = basePay;}

  /**
   Returns string representation of the full time employee

   @return string representation of the full time employee
  */
  public String toString()
  {
     return "Full Time Employee" + "[" + this.getFirstName() + ", " + this.getLastName() + ", " + this.getAge() + ", " +  this.getSSN() + ", " +
            this.getAddress().toString() + ", " + this.getID() + ", " + this.getEducationLevel() + ", " + this.getDirectDeposit() + ", " + this.basePay + "]";

  }
}
