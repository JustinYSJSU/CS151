/**
 @author: Justin Yamamoto
 @date: 10/3/2022

 This is the StudentTest class for hw3 of cs151 with professor newton
*/

public class StudentTest
{
  public static void main(String[] args)
  {
     try
     {
       Course c = new Course("CS151", "Object Oriented Design and Programming", "CS", "6:00PM","Tue");
       Student s = new Student("John", "Smith", 20, 3.6, "Computer Science", "School of Computer Science", c);
       Student s2 = (Student) s.clone();  
       s.printInfo();
       s2.printInfo();
     }
     catch(CloneNotSupportedException e)
     {
       System.out.println(e);
     }
  }
}
