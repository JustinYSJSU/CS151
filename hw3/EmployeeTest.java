/**
 @author: Justin Yamamoto
 @date: 10/4/2022

 This is the EmployeeTest class for hw3 of cs151 with professor newton
*/

public class EmployeeTest
{
   public static void main(String[] args)
   {
     Employee e1 = new Employee("John", "Smith", 101, 35);
     System.out.println(e1.computePay(40));
     System.out.println(e1.computePay(23));
     System.out.println(e1.computePay(1));
     System.out.println(e1.computePay(0));
     System.out.println(e1.computePay(-5));
     System.out.println(e1.computePay(45));
   }
}
