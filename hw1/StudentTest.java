/**
 @author Justin Yamamoto
 @date 9/1/2022

 This class tests the Student class found in Student.java
 It creates a Student object and prints that students schedule
*/

public class StudentTest
{
  public static void main(String[] args)
  {
   
    Student test = new Student("John", "Smith", 20, 3.6, "Computer Science", "School of Computer Science");
    Student.Class classTest = test.new Class();
    System.out.println(classTest.printSchedule());
  }
}
