/**
 @author: Justin Yamamoto
 @date: 9/29/2022

 This is the Address class for hw2 of cs151 with professor newton
*/

public class Address 
{
   private int streetNumber;
   private String streetName;
   private String city;
   private String zip;
   private String state;

   /**
    Constructor for an Address

   @param streetNumber the street number
   @param streetName the street name
   @param city the city
   @param zip the zip code
   @param state the state
  */
  public Address(int streetNumber, String streetName, String city, String zip, String state)
  {
    this.streetNumber = streetNumber;
    this.streetName = streetName;
    this.city = city;
    this.zip = zip;
    this.state = state;
  }

  /**
   sets the streetNumber

   @param the street number
  */
  public void setStreetNumber(int streetNumber){this.streetNumber = streetNumber;}

  /**
   gets the streetNumber

   @return the street number
  */
  public int getStreetNumber(){return this.streetNumber;}

  /**
    sets the streetName

    @param the street name
  */
  public void setStreetName(String streetName){this.streetName = streetName;}

  /**
   gets the streetName

   @return the street name
  */
  public String streetName(){return this.streetName;}

  /**
    sets the City

    @param the city 
  */
  public void setCity(String city){this.city = city;}

  /**
   gets the city

   @return the city  
  */
  public String getCity(){return this.city;}

  /**
    sets the zip

    @param the zip 
  */
  public void setZip(String zip){this.zip = zip;}

  /**
   gets the zip

   @return the zip  
  */
  public String getZip(){return this.zip;}

  /**
    sets the state

    @param the state 
  */
  public void setState(String state){this.state = state;}

  /**
   gets the state

   @return the state  
  */
  public String getState(){return this.state;}

  /**
   Returns a String representation of the Address

   @return a String representation of the Address
  */
  public String toString()
  {
    return "Address: " + this.streetNumber + " " + this.streetName + " " + this.city + " " + this.zip + " " + this.state;
  }
}
