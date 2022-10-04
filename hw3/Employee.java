/**
 @author: Justin Yamamoto
 @date: 10/4/2022
 
 This is the Employee class for hw3 of cs151 with professor newton
*/

public class Employee
{
   private String firstName;
   private String lastName;
   private int id;
   private int hourlyPay;

   /**
    Constructor for an Employee

    @param firstName the first name
    @param lastName the last name
    @param id the id
    @param hourlyPay the hourly pay
   */
   public Employee(String firstName, String lastName, int id, int hourlyPay)
   {
      this.firstName = firstName;
      this.lastName = lastName;
      this.id = id;
      this.hourlyPay = hourlyPay;
   }  

   /**
    Computes the pay for an Employee given the number of hours worked
    Hours must be greater than 0 and equal to or less than 40

    @param hours the number of hours the Employee worked
    @return the amount of pay for the Employee in dollars
   */
   public double computePay(int hours)
   {
      if(hours < 0)
      {
         NumberFormatException e = new NumberFormatException("Employee cannot work less than 0 hours. Please try again.");
         System.out.println(e.getMessage());
         return 0;
      }
      
      else if(hours > 40)
      {
        TooManyHoursWorkedException e = new TooManyHoursWorkedException("Employee cannot work more than 40 hours. Please try again.");
        System.out.println(e.getMessage());
        return 0;
      }
      double pay = this.hourlyPay * hours;
      return (double) Math.round(pay * 100) / 100;
   }
   /**
    set the first name
   
    @param firstName the first name
   */
   public void setFirstName(String firstName){this.firstName = firstName;}

   /**
    get the first name

    @reutrn the first name
   */
   public String getFirstName(){return this.firstName;}

   /**
    set the last name

    @param lastName the last name
   */
   public void setLastName(String lastName){this.lastName = lastName;}

   /**
    get the last name

    @return the last name
   */
   public String getLastName(){return this.lastName;}

   /**
    set the id

    @param id the id
   */
   public void setID(int id){this.id = id;}

   /**
    get the id

    @return the id
   */
   public int getID(){return this.id;}

   /**
    set the hourly pay

    @param hourlyPay the hourly pay
   */
   public void setHourlyPay(int hourlyPay){this.hourlyPay = hourlyPay;}

   /**
    get the hourly pay

    @return the hourly pay
   */
   public int getHourlyPay(){return this.hourlyPay;}
}
