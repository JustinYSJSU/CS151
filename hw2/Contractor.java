/**
 @author: Justin Yamamoto
 @date: 9/29/2022
 
 This is the contractor class for hw2 of cs151 with professor newton
*/

public class Contractor extends Employee
{
  private double basePay;
 
  /**
   Empty constuctor for Contractor

  */
  public Contractor(){}

  /**
   Constructor for Contractor

   @param firstName the firstName
   @param lastName the lastName
   @param address the address
   @parma id the id
   @basePay the base pay
   @ssn the ssn
   @age the age

  */
  public Contractor(String firstName, String lastName, int age, Address address, int id, String educationLevel, boolean directDeposit, double basePay, String ssn)
  {
    super(firstName, lastName, age, ssn, address, id, educationLevel, directDeposit);
    this.basePay = basePay;
  }
 
  /**
   Sets the base pay

   @param basePay the basePay
  */
  public void setBasePay(double basePay){this.basePay = basePay;}

  /**
   Gets the base pay
  
   @return the base pay
  */
  public double getBasePay(){return this.basePay;}

  /**
   Returns a string representation of the Contractor

   @return a string representation of the Contractor 
  */
  @Override
  public String toString()
  {
     return "Contractor" + "[" + this.getFirstName() + ", " + this.getLastName() + ", " + this.getAddress().toString() + ", " +
            this.getID() + ", " + this.getEducationLevel() + ", " + this.getDirectDeposit() + ", " + this.basePay + ", " + this.getSSN() + "]";
  }

  /**
   Introduces the Contractor

   @param displaySSN display ssn if true, do not otherwise
  */
  public void introduce(boolean displaySSN)
  {
    if(displaySSN)
    {
      System.out.println(this.toString());
    }
    else
    {
      System.out.println("Contractor" + "[" + this.getFirstName() + ", " + this.getLastName() + ", " + this.getAddress().toString() + ", " + this.getID() + ", " 
                        + this.getEducationLevel() + ", " + this.getDirectDeposit() + ", "  + this.basePay + "]");
    }
  }

  /**
   Calculates the pay for a contractor
   multiplies the hourly rate by the amount of hours worked

   @param numHours the number of hours worked
  */
  public double computePay(int numHours)
  {
    double pay = this.basePay *= numHours;
    return (double) Math.round(pay * 100) / 100;

  }
}
