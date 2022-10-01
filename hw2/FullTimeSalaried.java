/**
 @author: Justin Yamamoto
 @date: 9/29/2022

 This is the FullTimeSalaried class for hw2 of cs151 with professor newton
*/

public class FullTimeSalaried extends FullTimeEmployee
{
  /**
   Blank constructor for FullTimeSalaried employee

  */
  public FullTimeSalaried(){}

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
  */
  public FullTimeSalaried(String firstName, String lastName, int age, String ssn, Address address, int id, String educationLevel, boolean directDeposit, double basePay)
  {
     super(firstName, lastName, age, ssn, address, id, educationLevel, directDeposit, basePay);
  }

  /**
   Returns string representation of FullTimeSalaried employee

   @return string representation of FullTimesalaried employee
  */
  public String toString()
  {
    return "Full Time Salaried Employee" + "[" + this.getFirstName() + ", " + this.getLastName() + ", " + this.getAge() + ", " +  this.getSSN() + ", " +
            this.getAddress().toString() + ", " + this.getID() + ", " + this.getEducationLevel() + ", " + this.getDirectDeposit() + ", " + this.getBasePay() + "]";

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
      System.out.println("Full Time Salaried Employee" + "[" + this.getFirstName() + ", " + this.getLastName() + ", " + this.getAge() + ", " +
            this.getAddress().toString() + ", " + this.getID() + ", " + this.getEducationLevel() + ", " + this.getDirectDeposit() + ", " + this.getBasePay() + "]");
    }
  }

  /**
   computes the pay for the full time salaried employee

   @param numWeeks the number of weeks the employee worked
  */
  public double computePay(int numWeeks)
  {
    int weeksInYear = 52;
    double pay = this.getBasePay() / weeksInYear;
    pay *= numWeeks;
    return (double) Math.round(pay * 100) / 100;
  }
}
