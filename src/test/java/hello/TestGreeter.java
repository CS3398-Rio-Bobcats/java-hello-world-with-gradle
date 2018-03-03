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
    
    public void newtest_ANA_GreeterPass() {
        
        g.setName("Arys pass test");
        
        assertEquals(g.getName(),"Arys pass test");
        
    }
    
    @Test
    
    public void newtest_ANA_GreeterFail(){
        
        g.setName("Arys pass fail");
        
        assertEquals(g.getName(), "fails");
    }

}
