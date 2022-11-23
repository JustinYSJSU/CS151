/**
 @author: Justin Yamamoto
 @date: 9/29/2022
 This is the Person class for hw2 cs151 with professor newton
*/

public class Person
{
  private String firstName;
  private String lastName;
  private int age;
  private String ssn;
  private Address address;

 /**
  Empty constructor for a Person
 */
 public Person(){}

 /**
  Parametized constructor for a Person
 
  @param firstName the first name
  @param lastName the last name
  @param ssn the ssn
  @param address the address
 */
 public Person(String firstName, String lastName,int age, String ssn, Address address)
 {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.ssn = ssn;
    this.address = address;
 }

 /**
  Set the firstName of a Person
  @param the first name
 */
 public void setFirstName(String firstName){this.firstName = firstName;}

 /**
  Gets the firstName of a Person
  @return the firstname
 */
 public String getFirstName(){return this.firstName;}

 /**
  Set the lastName of a Person
  @param the last name
 */
 public void setLastName(String lastName){this.lastName = lastName;}

 /**
  Sets the age of a person
  @param age the age
 */
 public void setAge(int age){this.age = age;}

 /**
  Gets the age of a person
  @return the age of a person
 */
 public int getAge(){return this.age;}

 /**
  Gets the lastName of a Person
  @return the last name
 */
 public String getLastName(){return this.lastName;}

 /**
  Set the ssn of a Person
  @param the ssn
 */
 public void setSSN(String ssn){this.ssn = ssn;}

 /**
  Gets the ssn of a Person
  @return the ssn
 */
 public String getSSN(){return this.ssn;}

 /**
   Set the address  of a Person
   @param the address
 */
 public void setAddress(Address address){this.address = address;}

 /**
  Gets the address  of a Person
  @return the address
 */
 public Address getAddress(){return this.address;}

 /**
  Returns a String representation of the Person
  @return a String representation of the Person 
 */
 public String toString()
 {
   return "Person " + "[" + this.firstName + ", " + this.lastName + ". " + this.age + ", "  + this.ssn + ", " + this.address.toString() + "]";
 }


}
