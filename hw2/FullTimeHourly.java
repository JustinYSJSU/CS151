/**
 @author: Justin Yamamoto
 @date: 9/29/2022

 This is the FullTimeSalaried class for hw2 of cs151 with professor newton
*/

public class FullTimeHourly extends FullTimeEmployee
{
  private double overTimePay;

  /**
   Blank constructor for FullTimeHourly employee

  */
  public FullTimeHourly(){}

  /**
   Constructor for FullTimeSalaried employee

   @param firstName the firstName
   @param lastName the lastName
   @param age the age
   @param ssn the ssn
   @param address the address
   @param id the id
   @param educationLevel the education level
   @param directDeposity direct deposit preference
   @param basePay the basePay of the employee
   @param overTimePay the overtime pay
  */
  public FullTimeHourly(String firstName, String lastName, int age, String ssn, Address address, int id, String educationLevel, boolean directDeposit, double basePay, double overTimePay)
  {
     super(firstName, lastName, age, ssn, address, id, educationLevel, directDeposit, basePay);
     this.overTimePay = overTimePay;
  }

  /**
   Set the over time pay

   @param overTimePay the over time pay
  */
  public void setOverTimePay(double overTimePay){this.overTimePay = overTimePay;}

  /**
   Get the over time pay

   @return the over time pay
  */
  public double getOverTimePay(){return this.overTimePay;}

  /**
   Returns string representation of FullTimeHourly employee

   @return string representation of FullTimeHourly employee
  */
  public String toString()
  {
    return "Full Time Hourly Employee" + "[" + this.getFirstName() + ", " + this.getLastName() + ", " + this.getAge() + ", " +  this.getSSN() + ", " +
            this.getAddress().toString() + ", " + this.getID() + ", " + this.getEducationLevel() + ", " + this.getDirectDeposit() + ", " + this.getBasePay() + 
            ", " + this.overTimePay + "]";
  }

  /**
   introduces the full time salaried employee

   @param displaySSN shows ssn if true, do not otherwise
  */
  public void introduce(boolean displaySSN)
  {
    if(displaySSN)
    {
      System.out.println(this.toString());
    }
    else
    {
      System.out.println("Full Time Hourly Employee" + "[" + this.getFirstName() + ", " + this.getLastName() + ", " + this.getAge() + ", " +
            this.getAddress().toString() + ", " + this.getID() + ", " + this.getEducationLevel() + ", " + this.getDirectDeposit() + ", " + this.getBasePay() + 
            ", " + this.overTimePay + "]");
    }
  }

  /**
   computes the pay for the full time hours employee

   @param numWeeks the number of hours the employee worked
  */
  public double computePay(int numHours)
  {
    int normalHours = 40;
    if(numHours > normalHours)
    {
      int overTimeHours = normalHours - numHours;
      double normalPay = this.getBasePay() * numHours;
      double overTimePay = this.getBasePay() * overTimeHours;
      normalPay += overTimePay;
      return (double) Math.round(normalPay * 100) / 100;
    }
    double normalPay = this.getBasePay() * numHours;
    return (double) Math.round(normalPay * 100) / 100;
  }
}
