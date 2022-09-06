/**
 @author: Justin Yamamoto
 @date: 9/6/2022

 This is part of exercise 5 of cs151 hw1 with professor newton
 This implements the AnimalTest class
*/
public class AnimalTest
{
  public static void main(String[] args)
  {
     
     Dog d = new Dog("Dog", "D", 5, "Male", "Home", 3);
     d.move();
     d.sound();
     d.eat();
     d.sleep();
     System.out.println(d.toString());   
     d.walk();
     d.greetHuman();
     d.bark();
  
     System.out.println();
   
     Cat c = new Cat("Cat", "C", 7, "Female", "Home", 4);
     c.move();
     c.sound();
     c.eat();
     c.sleep();
     System.out.println(c.toString());
     c.walk();
     c.greetHuman();
     c.scratch();
 
     System.out.println();

     Racoon r = new Racoon("Racoon", "R", 7, "Male", "Forest", 8);
     r.move();
     r.sound();
     r.eat();
     r.sleep();
     System.out.println(r.toString());
     r.scratch();

     System.out.println();

     Whale w = new Whale("Whale", "W", 10, "Female", "Ocean", 20);
     w.move();
     w.sound();
     w.eat();
     w.sleep();
     System.out.println(w.toString());
     w.swim();

  }
}
