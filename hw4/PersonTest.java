import java.util.*;

/**
 @author: Justin Yamamoto
 @date: 10/20/2022

 This is the PersonTest class for exercise 3 of hw4 for cs151 with professor newton
*/

public class PersonTest
{
  public static void main(String[] args)
  {
     List<Person> l1 = new ArrayList<Person>();
     l1.add(new Person("Joe", "Smith", 40));
     l1.add(new Person("Amy", "Gold", 32));
     l1.add(new Person("Tony", "Stork", 21));
     l1.add(new Person("Sean", "Irish", 24));
     l1.add(new Person("Tina", "Brock", 28));
     l1.add(new Person("Lenny", "Hep", 18));

     Comparator<Person> firstNameAscend = new Comparator<Person>(){
        @Override
        public int compare(Person p1, Person p2){return p1.getFirstName().compareTo(p2.getFirstName());}
     };

     System.out.println("SORTED FIRST NAME ASCENDING");
     l1.sort(firstNameAscend);
     for(Person p : l1)
     {
       System.out.println(p.getFirstName());
     }

     System.out.println();

     Comparator<Person> firstNameDescend = new Comparator<Person>(){
        @Override
        public int compare(Person p1, Person p2){return p2.getFirstName().compareTo(p1.getFirstName());}
     };
     
     System.out.println("SORTED FIRST NAME DESCENDING");
     l1.sort(firstNameDescend);
     for(Person p : l1)
     {
       System.out.println(p.getFirstName());
     }

     System.out.println();

     Comparator<Person> lastNameAscend = new Comparator<Person>(){
        @Override
        public int compare(Person p1, Person p2){return p1.getLastName().length() - p2.getLastName().length();}
     };

     System.out.println("SORTED LAST NAME LENGTH ASCENDING");
     l1.sort(lastNameAscend);
     for(Person p : l1)
     {
       System.out.println(p.getLastName());
     }

     System.out.println();
     
     Comparator<Person> lastNameDescend = new Comparator<Person>(){
        @Override
        public int compare(Person p1, Person p2){return p2.getLastName().length() - p1.getLastName().length();}
     };

     System.out.println("SORTED LAST NAME LENGTH DESCENDING");
     l1.sort(lastNameDescend);
     for(Person p : l1)
     {
       System.out.println(p.getLastName());
     }

     System.out.println();

     Comparator<Person> ageAscend = new Comparator<Person>(){
        @Override
        public int compare(Person p1, Person p2){return p1.getAge() - p2.getAge();}
     };

     System.out.println("SORTED AGE ASCENDING");
     l1.sort(ageAscend);
     for(Person p : l1)
     {
       System.out.println(p.getAge());
     }

     System.out.println();

     Comparator<Person> ageDescend = new Comparator<Person>(){
        @Override
        public int compare(Person p1, Person p2){return p2.getAge() - p1.getAge();}
     };

     System.out.println("SORTED AGE DESCENDING");
     l1.sort(ageDescend);
     for(Person p : l1)
     {
       System.out.println(p.getAge());
     }


  }
}
