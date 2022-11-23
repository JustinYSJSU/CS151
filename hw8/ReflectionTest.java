import java.lang.reflect.*;

/**
 author: Justin Yamamoto
 date: 11/23/2022

 This is hw8 of cs151 with professor newton
*/
public class ReflectionTest
{
   public static void main(String[] args)
   {
      Person p1 = new Person();
      Class c1 = p1.getClass();
      Method[] m1 = c1.getDeclaredMethods();
      System.out.println("Person Class all declared methods (with parameter number and types)");
      for(Method m : m1)
      {
         String methodName = m.getName(); //name of method
         Class[] param = m.getParameterTypes(); //types of parameters
         if(param.length == 0)
         {
            System.out.println(methodName + "() has no parameters");
         }
         else
         {
            System.out.println(methodName + "() has " + param.length + " parameters with the following types");
            for(Class c : param)
            {
              System.out.println(c.getName() + "\n"); 
            }
         }
         System.out.println();
      }
      
      System.out.println("*************************************************************");

      Address a1 = new Address();
      Class c2 = a1.getClass();
      Method[] m2 = c2.getMethods();
      System.out.println("Address Class all declared methods (with parameter number and types)");
      for(Method m : m2)
      {
         String methodName = m.getName(); //name of method
         Class[] param = m.getParameterTypes(); //types of parameters
         if(param.length == 0)
         {
            System.out.println(methodName + "() has no parameters");
         }
         else
         {
            System.out.println(methodName + "() has " + param.length + " parameters with the following types");
            for(Class c : param)
            {
              System.out.println(c.getName() + "\n"); 
            }
         }
         System.out.println();
      }
      System.out.println("Address class all declared fields (access modifier and type)");
      Field[] f1 = Address.class.getDeclaredFields();
      for(Field f : f1)
      {
        System.out.println(f.toString());
      }
      System.out.println("*************************************************" + "\n");
      System.out.println("Instantiating 3 instances of Person");
      try
      {
        Constructor<Person> personConstructor = Person.class.getConstructor(String.class, String.class, int.class, String.class, Address.class);
        Constructor<Address> addressConstructor = Address.class.getConstructor(int.class, String.class, String.class, String.class, String.class);

        Address add1 = addressConstructor.newInstance(4212, "Hi St", "San Jose", "92312", "CA");
        Address add2 = addressConstructor.newInstance(4814, "Bye St", "San Jose", "23215", "CA");
        Address add3 = addressConstructor.newInstance(8422, "Hello St", "San Jose", "34831", "CA");

        Person per1 = personConstructor.newInstance("John", "Smith", 30, "542-542-3214", add1);
        Person per2 = personConstructor.newInstance("Jane", "Doe", 25, "689-421-6214", add2);
        Person per3 = personConstructor.newInstance("John", "Doe", 33, "563-364-2331", add3);
        System.out.println(per1.toString());
        System.out.println(per2.toString());
        System.out.println(per3.toString());

        System.out.println("*************************************************" + "\n");
        System.out.println("Using Java Reflection to invoke setFirstName(), setLastName(), setAge() on the first Person instance");
        Method setFirstName = c1.getMethod("setFirstName", String.class);
        setFirstName.invoke(per1, "James");
        Method setLastName = c1.getMethod("setLastName", String.class);
        setLastName.invoke(per1, "Sky");
        Method setAge = c1.getMethod("setAge", int.class);
        setAge.invoke(per1, 22);
        System.out.println(per1.toString());
        System.out.println(per2.toString());
        System.out.println(per3.toString());

      }
      catch(NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e)
      {
         System.out.println(e);;
      }



   }
}

