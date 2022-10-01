/**
 @author: Justin Yamamoto
 @date: 9/29/2022

 This is the PatrtTimeHourly class for hw2 for cs151 with professor newton
*/

public class PartTimeHourly extends Employee
{
  private double baseHourlyPay;

  /**
   Empty constructor for PartTimeHourly 

  */
  public PartTimeHourly(){}

  /**
   Constructor for PartTimeHourly

   @param firstName the first name
   @param lastName the last name
   @param address the address
   @param id the id
   @baseHourlyPay the pay
   @ssn the ssn
  */
  public PartTimeHourly(String firstName, String lastName,int age, String ssn, Address address, int id, String educationLevel, boolean directDeposit, double baseHourlyPay)
  {
    super(firstName, lastName, age, ssn, address, id, educationLevel, directDeposit);
    this.baseHourlyPay = baseHourlyPay;
  }

  /**
   Sets the hourly pay

   @param baseHourlyPay the hourly pay
  */
  public void setBaseHourlyPay(double baseHourlyPay){this.baseHourlyPay = baseHourlyPay;}

  /**
   Gets the hourly pay

   @return the hourly pay
  */
  public double getBaseHourlyPay(){return this.baseHourlyPay;}

  /**
   Returns a string representation of the PartTimeHourly employee

   @return string representation of the PartTimeHourly employee
  */
  public String toString()
  {
     return "Part Time Hourly Employee" + "[" + this.getFirstName() + ", " + this.getLastName() + ", " + this.getAge() + ", " +  this.getSSN() + ", " +
            this.getAddress().toString() + ", " + this.getID() + ", " + this.getEducationLevel() + ", " + this.getDirectDeposit() + ", " + this.getBaseHourlyPay() +"]";

  }

  /**
   Introduces the part time worker

   @param displaySSN diplay ssn if true, do not otherwise
  */
  public void introduce(boolean displaySSN)
  {
    if(displaySSN)
    {
      System.out.println(this.toString());
    }
    else
    {
      System.out.println("Part Time Hourly Employee" + "[" + this.getFirstName() + ", " + this.getLastName() + ", " + this.getAge() + ", " +  this.getSSN() + ", " +
             this.getAddress().toString() + ", " + this.getID() + ", " + this.getEducationLevel() + ", " + this.getDirectDeposit() + ", " + this.baseHourlyPay +"]");
    }
  }

  /**
   computes the part for the part time worked
   hours * hourly rate, hours cannot exceed 40

   @param numHours number of hours worked
  */
  public double computePay(int numHours)  
  {
    int normalHours = 40;
    if(numHours > normalHours)
    {
      return -1;
    }
    double pay = this.baseHourlyPay *= numHours;
    return (double) Math.round(pay * 100) / 100;

  }
}
