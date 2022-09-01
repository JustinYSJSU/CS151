

/**
 @author Justin Yamamoto
 @Date 9/1/2022
 This is Exercise A of CS151 HW#1 with Professor Newton. 
 This implements the Student class, the Class inner class,  and the printSchedule() method
*/

public class Student
{
  private String firstName;
  private String lastName;
  private int age;
  private double gpa;
  private String major;
  private String department;
 
  /**
   Constructor for the Student class
   Creates an instance of the Student class but does not initialize its attributes
  */
  public Student()
  {

  }

  /**
   Constructor for the Student class 
   Creates an instance of the Student class and intializes its attributes 

   @param firstName the first name of the student
   @param lastName the last name of the student
   @param age the age of the student
   @param gpa the current gpa of the student
   @param major the college major of of the student
   @param department the department the student belongs to
  */
  public Student(String firstName, String lastName, int age, double gpa, String major, String department)
  {
     this.firstName = firstName;
     this.lastName = lastName;
     this.age = age;
     this.gpa = gpa;
     this.major = major;
     this.department = department;
  }


  /**  
   This is the "inner class" Class required for this exercise
  */
  
  public class Class
  {
    /**
     Prints a pre-defined schedule for the student
     
     @return a predefined schedule for the student 
    */
    public String printSchedule()
    {
      return "CMPE 102 Mon/Wed 9:00 - 10:15" + "\n" + "CMPE133 Tue 6:00 - 8:45" + "\n" + "CS151 Mon/Wed 6:00 - 7:15";
    }
  }


  /**
   Gets the first name of the student

   @return the first name of the student
  */
   public String getFirstName(){return this.firstName;}

  /**
   Sets the first name of the student
  
   @param the first  name of the student
  */
  public void  setFirstName(String name){this.firstName = name;}

  /**
   Gets the last name of the student

   @return the last name of the student
  */
  public String getLastName(){return this.lastName;}

  /**
   Sets the last name of the student

   @param the last name of the student
  */
  public void setLastName(String lastName){this.lastName = lastName;}

  /**
   Gets the age of the student

   @return the age of the student
  */
  public int getAge(){return this.age;}

  /**
   Sets the age of the student
   
   @param age The age of the student
  */
  public void setAge(int age){this.age = age;}

  /**
   Gets the gpa of the student

   @return gpa the gpa of the student
  */
  public double getGpa(){return this.gpa;}

  /**
   Sets the gpa of the student 
 
   @param gpa the gpa of the student
  */
  public void setGpa(double gpa){this.gpa = gpa;}

  /**
   Gets the major of the student
   
   @return the major of the student
  */
  public String getMajor(){return this.major;}
  
  /**
   Sets the major of the student
  
   @param major the major of the student
  */
  public void setMajor(String major){this.major = major;}

  /**
   Gets the department of the student

   @return the department of the student
  */
  public String getDepartment(){return this.department;}

  /**
   Sets the department of the student

   @param department the department of the student
  */
  public void setDepartment(String department){this.department = department;}

}
