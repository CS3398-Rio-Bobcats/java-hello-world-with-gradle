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
    
    public void newAryGreeterPass() {
        
        g.setName("Arys test");
        
        assertEquals(g.getName(),"Arys test");
        
    }
    
    @Test
    
    public void newtestAryGreeterFail() {
        
        g.setName("Arys test to fail");
        
        assertEquals(g.getName(),"fails");
        
    }

}
