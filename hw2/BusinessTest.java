
/**
 @author: Justin Yamamoto
 @date: 9/30/2022

 This is the BusinessTest class for hw2 of cs151 with professor newton
*/

public class BusinessTest
{
   public static void main(String[] args)
   {
     Address customerAddress1 = new Address(1234, "Washington St", "San Jose", "94088", "CA");
     Customer c1 = new Customer("John", "Smith", 20, "467-132-5312", customerAddress1, 1, "Card");
     c1.introduce();
     c1.makePayment();

     System.out.println(); 

     Address customerAddress2 = new Address(4321, "Hello Rd", "San Jose", "94088", "CA");
     Customer c2 = new Customer("Jane", "Smith", 20, "764-231-2135", customerAddress2, 2, "Cash");
     c2.introduce();
     c2.makePayment();

     System.out.println(); 

     Address contractorAddress1 = new Address(2314, "Hi St", "Hayward", "94552", "CA");
     Contractor ct1 = new Contractor("Mister", "Em", 35,  contractorAddress1, 1, "College", true, 100.0, "456-123-6824");
     ct1.introduce(true);
     System.out.println(ct1.computePay(40));
     
     System.out.println();

     Address contractorAddress2 = new Address(4029, "Bridge Ct", "San Francisco", "42342", "CA");
     Contractor ct2 = new Contractor("Joe", "Me", 35,  contractorAddress1, 1, "PhD", true, 200, "123-453-9824");
     ct2.introduce(false);
     System.out.println(ct2.computePay(35));

     System.out.println();

     Address partTimeHourlyAddress1 = new Address(3452, "Family Dr", "New York", "87894", "NY");
     PartTimeHourly pth1 = new PartTimeHourly("James", "Stone", 25, "213-531-4313", partTimeHourlyAddress1, 1, "College", true, 60);
     pth1.introduce(true);
     System.out.println(pth1.computePay(40));

     System.out.println();

     Address partTimeHourlyAddress2 = new Address(3452, "Spy Road", "New York", "87894", "NY");
     PartTimeHourly pth2 = new PartTimeHourly("Jamie", "Stone", 24, "312-213-4321", partTimeHourlyAddress2, 2, "College", true, 65);
     pth2.introduce(false);
     System.out.println(pth2.computePay(50));

     System.out.println();

     Address executiveAddress1 = new Address(5321, "Boss Ct", "San Jose", "43143", "CA");
     Executive e1 = new Executive("Bosu", "Gai", 40, "432-523-4313", executiveAddress1, 1, "Masters", true, 50000, 200000);
     e1.introduce(true);
     System.out.println(e1.computePay());

     System.out.println();

     Address executiveAddress2 = new Address(2134, "Exec Dr", "San Diego", "53298", "CA");
     Executive e2 = new Executive("EyeAm", "Boss", 42, "532-521-4321", executiveAddress2, 2, "Masters", true, 60000, 600000);
     e2.introduce(false);
     System.out.println(e2.computePay());

     System.out.println();

     Address fullTimeSalariedAddress1 = new Address(5187, "Full Ct", "San Jose", "43245", "CA");
     FullTimeSalaried fts1 = new FullTimeSalaried("Jay", "Lost", 25, "424-141-5421", fullTimeSalariedAddress1, 1, "College", true, 90000.0);
     fts1.introduce(true);
     System.out.println(fts1.computePay(4)); 

     System.out.println();

     Address fullTimeSalariedAddress2 = new Address(8517, "Far Ct", "Sacramento", "78342", "CA");
     FullTimeSalaried fts2 = new FullTimeSalaried("James", "Short", 39, "532-342-9874", fullTimeSalariedAddress2, 2, "PhD", true, 150000);
     fts2.introduce(false);
     System.out.println(fts2.computePay(4)); 

     System.out.println();

     Address fullTimeHourlyAddress1 = new Address(5431, "Short Ct", "San Jose", "57782", "CA");
     FullTimeHourly fth1 = new FullTimeHourly("Johnny", "Spark", 27, "543-145-1432", fullTimeHourlyAddress1, 1,"College", true, 60,70);
     fth1.introduce(true);
     System.out.println(fth1.computePay(40));

     System.out.println();

     Address fullTimeHourlyAddress2 = new Address(9821, "Cubby St", "San Jose", "98732", "CA");
     FullTimeHourly fth2 = new FullTimeHourly("Liam", "Bryne", 55, "543-145-1432", fullTimeHourlyAddress1, 1,  "College", true, 70,70);
     fth2.introduce(false);
     System.out.println(fth2.computePay(45));
   }
}

