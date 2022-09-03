/**
 @author Justin Yamamoto
 @date 9/3/2022

 This part of exercise #3 for cs151 hw#1 with Professor Newton
 This program implements the Employee class
*/

public class Employee extends Person
{
  private int id;
  private String status;
  private double payAmount;

  /**
   Constuctor for the Employee class
   Also calls the constructor for the Person class
   
   @param firstName the first name of the employee
   @param lastName the last name of the employee
   @param age the age of the employee
   @param socialSercurityNumber the ssn of the employee
   @param address the address of the employee
   @param gender the gender of the employee
   @weight the weight of the employee
   @param id The employee id
   @param status the employment status
   @param payAmount the pay amount
  */
  public Employee(String firstName, String lastName, int age, int socialSecurityNumber, String address, String gender, double weight, int id, String status, double payAmount)
  {
    super(firstName, lastName, age, socialSecurityNumber, address, gender, weight);
    this.id = id;
    this.status = status;
    this.payAmount = payAmount;    
  }

  /**
   introduces the employee, showing all their attributes
   calls the introduce() method for the Person class
  */
  @Override
  public void introduce()
  {
    super.introduce();
    System.out.println("ID: " + this.id + "\n" + "Employment Status: " + this.status + "\n"
                       + "Pay Amount: " + this.payAmount);
  }

  /**
   Calculates total pay for an employee based on their status (part-time = hourly, full time = weekly)
   
   @param units number of units(hours or weeks) worked
   @return totalPay the total amount of money the employee has earned from working

  */
  public double computePay(int units)
  {
    String jobStatus = this.status.toLowerCase();
    double totalPay = 0;
    int weeksInYear = 52;

    if(jobStatus.equals("part time") || jobStatus.equals("contractor"))
    {
      totalPay = this.payAmount * units;
    }
    else if(jobStatus.equals("full time"))
    {
      this.payAmount = this.getPayAmount() / weeksInYear;
      totalPay = this.getPayAmount() * units;
    }
    else
    {
      System.out.println("Invalid employment type.");
    }
    double roundedPay = (double) Math.round(totalPay * 100) / 100;
    return roundedPay;
  }

  /**
   Gets the id of the employee

   @return the id of the employee
  */
  public int getId(){return this.id;}

  /**
   Sets the id of the employee
   
   @param id the id of the employee
  */
  public void setId(int id){this.id = id;}

  /**
   Gets the status of the employee

   @return the status of the employee
  */
  public String getStatus(){return this.status;}

  /**
   Sets the status of the employee

   @param status the status of the employee
  */
  public void setStatus(String status){this.status = status;}

  /**
   Gets the pay amount of the employee
 
   @return the pay amount of the employee
  */
  public double getPayAmount(){return this.payAmount;}

  /**
   Sets the pay amount of the employee

   @param payAmount the pay amount of the employee
  */
  public void setPayAmount(double payAmount){this.payAmount = payAmount;}


} 
