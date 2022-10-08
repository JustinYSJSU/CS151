/**
 @author: Justin Yamamoto
 @date: 10/4/2022

 This is the TooManyHoursWorkedException class for hw3 of cs151 with professor newton
 This exception is thrown when an Employee works more than 40 hours
*/

public class TooManyHoursWorkedException extends Exception
{

  /**
   Constructor for TooManyHoursWorkedException

   @param message the message for the user
  */
  public TooManyHoursWorkedException(String errorMessage)
  {
     super(errorMessage);
  }
}
