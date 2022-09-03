/**
 @author Justin Yamamoto
 @date 9/3/2022
 This program tests the Employee class
*/

public class EmployeeTest
{
  public static void main(String[] args)
  {
    Employee test1 = new Employee("Joe", "Smith", 22, 123456789, "123 Hi Drive", "Male", 120.0, 01, "Contractor", 60);
    test1.introduce();
    System.out.println("Total Pay for 30 hours: " + test1.computePay(30));

    System.out.println();
  
    Employee test2 = new Employee("Lisa", "Gray", 30, 987654321, "321 Bye Drive", "Female", 125.0, 02, "Full Time", 110000);
    test2.introduce();
    System.out.println("Total pay for 2 weeks: " + test2.computePay(2));

    System.out.println();

    Employee test3 = new Employee("Timothy", "Briggs", 34, 135792468, "213 Hello Drive", "Male", 140.0, 03, "Full Time", 80000);
    test3.introduce();
    System.out.println("Total pay for 4 weeks: " + test3.computePay(4));

    System.out.println();

    Employee test4 = new Employee("George", "Wallace", 20, 978461274, "132 Bye Drive", "Male", 120.0, 04, "Part Time", 20);
    test4.introduce();
    System.out.println("Total pay for 25 hours: " + test4.computePay(25));

    System.out.println();
  
    Employee test5 = new Employee("Amy", "Student", 36, 412643286, "312 Hi Drive", "Femlae", 107.0, 05, "Contractor", 45);
    test5.introduce();
    System.out.println("Total pay for 45 hours: " + test5.computePay(45));
  }
}
