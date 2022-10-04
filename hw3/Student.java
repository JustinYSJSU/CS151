/**
 @author: Justin Yamamoto
 @date: 10/3/2022

 This is the Student class for hw3 of cs151 for professor newton
*/

public class Student implements Cloneable
{
  private String firstName;
  private String lastName;
  private int age;
  private double gpa;
  private String major;
  private String department;
  private Course course;

  /**
   Constructor for the Student class

   @param firstName the first name
   @param lastName the last name
   @param age the age 
   @param gpa the gpa
   @param major the major
   @param department the department 
   @param course the Course 
  */
  public Student(String firstName, String lastName, int age, double gpa, String major, String department, Course course)
  {
     this.firstName = firstName;
     this.lastName = lastName;
     this.age = age;
     this.gpa = gpa;
     this.major = major;
     this.department = department;
     this.course = course;
  }

  /**
   Allows a copy of this Student to be created

   @return a copy of this student
  */
  @Override
  public Student clone()
  {
    return new Student(this.firstName, this.lastName, this.age, this.gpa, this.major, this.department, this.course);
  }

  /**
   Prints out all the information of a Student

  */
  public void printInfo()
  {
    System.out.println("Student[" + this.firstName + ", " + this.lastName + ", " + this.age + ", " + this.gpa + ", " + this.major + ", " + 
                       this.department + ", " + this.course.getCourse() + "]");
  }
  /**
   set the first name

   @param firstName the first name
  */
  public void setFirstName(String firstName){this.firstName = firstName;}

  /**
   get the first name

   @return the firstName
  */
   public String getFirstName(){return this.firstName;}

  /**
   set the last name

   @param last name the last name
  */
  public void setLastName(String lastName){this.lastName = lastName;}

  /**
   get the last name
  
   @return the last name
  */
  public String getLastName(){return this.lastName;}


  /**
   set the age

   @param age the age
  */
  public void setAge(int age){this.age = age;}

  /**
   get the age 

   @return the age
  */
  public int getAge(){return this.age;}

  /**
   set the gpa

   @param gpa the gpa
  */
  public void setGpa(double gpa){this.gpa = gpa;}

  /**
   get the gpa

   @return the gpa
  */
  public double getGpa(){return this.gpa;}

  /**
   set the major

   @param major the major
  */
  public void setMajor(String major){this.major = major;}

  /**
   get the major

   @return the major
  */
  public String getMajor(){return this.major;}

  /**
   set the department

   @param department the department
  */
  public void setDepartment(String department){this.department = department;}

  /**
   get the department

   @return the department
  */
  public String getDepartment(){return this.department;}

  /**
   set the course

   @param course the course
  */
  public void setCourse(Course c){this.course = c;}

  /**
   get the course

   @return the course
  */
  public Course getCourse(){return this.course;}
}

