/**
 @author: Justin Yamamoto
 @date: 9/29/2022
 
 This is the Customer class for hw2 of cs151 with professor newton
*/

public class Customer extends Person
{
  private int customerID;
  private String payPreference;
  /**
   Blank constructor for a Customer

  */
  public Customer(){}

  /**
   Constructor for a Customer

   @param firstName the first name
   @param lastName the last name
   @param age the age
   @param ssn the ssn
   @param address the address

  */
  public Customer(String firstName, String lastName,int age, String ssn, Address address, int customerID, String payPreference)
  {
     super(firstName, lastName, age, ssn, address);
     this.customerID = customerID;
     this.payPreference = payPreference;
  }

  /**
   Sets the customer ID

   @param customerID
  */
  public void setCustomerID(int customerID){this.customerID = customerID;}

  /**
   Gets the customer ID
  
   @return the customer id
  */
  public int getCustomerID(){return this.customerID;}

  /**
   sets pay preference
  
   @param pay preference
  */
  public void setPayPreference(String payPreference){this.payPreference = payPreference;}

  /**
   gets pay preference
   
   @return the pay preference
  */
  public String getPayPreference(){return this.payPreference;}

  /**
   Returns a String representation of this Customer 

   @return a String representation of the Customer
  */
  @Override
  public String toString()
  {
     return "Customer[" + this.getFirstName() + ", " + this.getLastName() + ", " + this.getAge() + ", "  + this.getSSN() + ", " + this.getAddress().toString() + ", " + this.customerID + ", " + this.payPreference + "]";
  }

  /**
   Introduces the Cusotmer, prints all info except ssn
 
  */
  public void introduce()
  {
    System.out.println("Customer[" + this.getFirstName() + ", " + this.getLastName() + ", " + this.getAge() + ", " + this.getAddress().toString() + ", " + this.customerID + ", " + this.payPreference + "]");
  }

  /**
   Displays the preferred pay method

  */
  public void makePayment(){System.out.println("Payment Preference: " + this.payPreference);}
}
