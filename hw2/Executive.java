/**
 @author Justin Yamamoto
 @date 9/29/2022

 This is the Executive class of hw2 for cs151 with professor newton
*/

public class Executive extends Employee
{
  private double yearlyBonus;
  private double yearlyCompensation;

  /**
   Empty constuctor for Executive

  */
  public Executive(){}

  /**
   Constructor for Executive

   @param firstName the first name
   @param lastName the last name
   @param address the address 
   @param age the age
   @param ssn the ssn
   @param yearlyBonus the yearly bonus
   @param yearlyCompensation the yearly compensation
  */
  public Executive(String firstName, String lastName, int age, String ssn, Address address, int id, String educationLevel, boolean directDeposit, double yearlyBonus, double yearlyCompensation)
  {
    super(firstName, lastName, age, ssn, address, id, educationLevel, directDeposit);
    this.yearlyBonus = yearlyBonus;
    this.yearlyCompensation = yearlyCompensation;
  }

  /**
   sets the yearly bonus

   @param yearlyBonus the yearly bonus
  */
  public void setYearlyBonus(double yearlyBonus){this.yearlyBonus = yearlyBonus;}

  /**
   gets the yearly bonus
   
   @return the yearly bonus
  */
  public double getYearlyBonus(){return this.yearlyBonus;}

  /**
   sets the yearly compensation

   @param yearlyCompensation the yearly compensation
  */
  public void setYearlyCompensation(double yearlyCompensation){this.yearlyCompensation = yearlyCompensation;}

  /**
   gets the yearly compensation
   
   @return the yearly compensation
  */
  public double getYearlyCompensation(){return this.yearlyCompensation;}

  /**
   return a string representation of the Executive

   @return string representatino of the Executive
  */
  public String toString()
  {
    return "Executive" + "[" + this.getFirstName() + ", " + this.getLastName() +", " + this.getAge() + ", " + this.getSSN() + ", " + this.getAddress().toString()
    + ", " + this.getID() + ", " + this.getEducationLevel() + ", " + this.yearlyBonus + ", " + this.yearlyCompensation + "]";
  }


  /**
   introduces the Executive

   @param displaySSN show ssn if true, do not otherwise
  */
  public void introduce(boolean displaySSN)
  {
    if(displaySSN)
    {
      System.out.println(this.toString());
    }
    else  
    {
      System.out.println("Executive" + "[" + this.getFirstName() + ", " + this.getLastName() +", " + this.getAge() + ", " + this.getAddress().toString()
    + ", " + this.getID() + ", " + this.getEducationLevel() + ", " + this.yearlyBonus + ", " + this.yearlyCompensation + "]"); 

    }
  }

  /**
    Calculates pay for the Executive 

  */
   public double computePay()
   {
     return this.yearlyCompensation += this.yearlyBonus;
   }
  
}
