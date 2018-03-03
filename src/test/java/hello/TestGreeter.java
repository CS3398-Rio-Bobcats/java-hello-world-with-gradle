package hello;



import static org.junit.Assert.*;



import org.junit.Before;

import org.junit.Test;





public class TestGreeter {



   private Greeter g;

	

   @Before

   public void setUp() throws Exception 

   {

      g = new Greeter();

   }



   @Test

   public void testGreeterEmpty() 

   {

      assertEquals(g.getName(),"");

      assertEquals(g.sayHello(),"Hello!");

   }

	

   @Test

   public void testGreeter() 

   {

      g.setName("World");

      assertEquals(g.getName(),"World");

      assertEquals(g.sayHello(),"Hello World!");

   }
     
  @Test
     
   public void newtestsvGreeterPass() {
          
     g.setName("This is sifa's pass test");
          
     assertEquals(g.getName(),"This is sifa's pass test");
          
     assertEquals(g.sayHello(),"Hello, this is sifa's pass test");
          
          
 }
     
}
