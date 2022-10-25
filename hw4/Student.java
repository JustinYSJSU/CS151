import java.util.*;
/**
 @author: Justin Yamamoto
 @date: 10/20/2022
 This is the Student class for hw4 of cs151 for professor newton
*/

public class Student
{
  private String firstName;
  private String lastName;
  private int age;
  private double gpa;
  private String major;
  private String department;
  private LinkedList<Course> courses;

  /**
   Constructor for the Student class
   @param firstName the first name
   @param lastName the last name
   @param age the age 
   @param gpa the gpa
   @param major the major
   @param department the department 
   @param courses the courses
  */
  public Student(String firstName, String lastName, int age, double gpa, String major, String department, LinkedList<Course> courses)
  {
     this.firstName = firstName;
     this.lastName = lastName;
     this.age = age;
     this.gpa = gpa;
     this.major = major;
     this.department = department;
     this.courses = courses;
  }

  /**
   Adds a course to the courses

   @param c the course to be added
  */
  public void add(Course c)
  {
     this.courses.add(c);
  }

  /**
   Removes a course from the courses

   @param c the course to be removed
  */
  public void remove(Course c)
  {
     this.courses.remove(c);
  }

  /**
   Sorts courses ascending or descending based off of the specified attritube

   @param ascending true if sort ascending, false otherwise
   @param the specified attribute 
  */
  public void sortCourses(boolean ascending, String attribute)
  {
    if(ascending) 
    {
       if(attribute.toLowerCase().equals("name"))
       {
          Comparator<Course> nameAscend = new Comparator<Course>(){
           @Override
           public int compare(Course c1, Course c2){return c1.getName().compareTo(c2.getName());}
           };
          courses.sort(nameAscend);
       }
      else if(attribute.toLowerCase().equals("description"))
      {
        Comparator<Course> descriptionAscend = new Comparator<Course>(){
         @Override
          public int compare(Course c1, Course c2){return c1.getDescription().compareTo(c2.getDescription());}
          };
         courses.sort(descriptionAscend);
      }
      else if(attribute.toLowerCase().equals("department"))
      {
        Comparator<Course> departmentAscend = new Comparator<Course>(){
         @Override
          public int compare(Course c1, Course c2){return c1.getDepartment().compareTo(c2.getDepartment());}
          };
          courses.sort(departmentAscend);
      }
      else if(attribute.toLowerCase().equals("time"))
      {
        Comparator<Course> timeAscend = new Comparator<Course>(){
         @Override
          public int compare(Course c1, Course c2){return c1.getTime().compareTo(c2.getTime());}
          };
          courses.sort(timeAscend);
      }
    }
    else
    {
       if(attribute.toLowerCase().equals("name"))
       {
          Comparator<Course> nameDescend = new Comparator<Course>(){
           @Override
           public int compare(Course c1, Course c2){return c2.getName().compareTo(c1.getName());}
           };
          courses.sort(nameDescend);
       }
      else if(attribute.toLowerCase().equals("description"))
      {
        Comparator<Course> descriptionDescend = new Comparator<Course>(){
         @Override
          public int compare(Course c1, Course c2){return c2.getDescription().compareTo(c1.getDescription());}
          };
         courses.sort(descriptionDescend);
      }
      else if(attribute.toLowerCase().equals("department"))
      {
        Comparator<Course> departmentDescend = new Comparator<Course>(){
         @Override
          public int compare(Course c1, Course c2){return c2.getDepartment().compareTo(c1.getDepartment());}
          };
          courses.sort(departmentDescend);
      }
      else if(attribute.toLowerCase().equals("time"))
      { 
        Comparator<Course> timeDescend = new Comparator<Course>(){
         @Override
          public int compare(Course c1, Course c2){return c2.getTime().compareTo(c1.getTime());}
          };
          courses.sort(timeDescend);
      }
    }

    for(Course c : courses)
    {
      System.out.println(c.getName());
    }
    System.out.println();
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
   set the courses
   @param courses the courses
  */
  public void setCourse(LinkedList<Course> courses){this.courses = courses;}

  /**
   get the courses
   @return the courses
  */
  public LinkedList<Course> getCourses(){return this.courses;}
}
