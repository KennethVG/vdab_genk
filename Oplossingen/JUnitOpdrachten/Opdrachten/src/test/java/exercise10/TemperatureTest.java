package exercise10;
import static org.junit.Assert.*;
import org.junit.*;

public class TemperatureTest{
   private static final float PRECISION = 0.01F;

   private Temperature t;
   
   @Before
   public void init() {
      t = new Temperature(20);       
   }
   
   @Test
   public void testConstructor() {
      assertEquals(20F,t.getValue(),PRECISION);
   }
   
   @Test
   public void testValue() {
      t.setValue(13F);
      assertEquals(13F,t.getValue(),PRECISION);
   }
         
   @Test
   public void testEquals() {
      Temperature t2 = new Temperature(20F);
      Temperature t3 = new Temperature(20F);
                  
      // Rule 1: reflexive
      assertTrue(t.equals(t));
      
      // Rule 2: transitive
      assertTrue(t.equals(t2));
      assertTrue(t2.equals(t3));
      assertTrue(t.equals(t3));
      
      // Rule 3: symmetric
      assertTrue(t2.equals(t));
      
      // Rule 4: null
      assertFalse(t.equals(null));
      
      // Rule 5: hashcode
      assertEquals(t.hashCode(),t2.hashCode());
      
      t2.setValue(25);
      assertFalse(t.equals(t2));
      assertFalse(t2.equals(t3));
      
      assertFalse(t.equals("a string"));
   }
   
   @Test
   public void testHashCode() {
      Temperature t = new Temperature(15);
      Temperature t2 = new Temperature(15);
           
      assertEquals(t.hashCode(),t.hashCode());
      assertTrue(t.equals(t2));
      assertEquals(t.hashCode(),t2.hashCode());
   }
   
   @Test
   public void testRounding() {
      t.setValue(20.123F);
      assertEquals(20.12,t.getValue(),PRECISION);      
      t.setValue(20.127F);
      assertEquals(20.13,t.getValue(),PRECISION);      
      t.setValue(20.125F);
      assertEquals(20.13,t.getValue(),PRECISION);            
   }

   @Test 
   public void testboiling(){
      t.setValue(110);
      assertTrue(t.isBoiling());
      t.setValue(90);
      assertFalse(t.isBoiling());
      t.setValue(99.99F);
      assertFalse(t.isBoiling());
      t.setValue(100F);
      assertTrue(t.isBoiling());
      t.setValue(100.01F);
      assertTrue(t.isBoiling());      
   }
   
   @Test
   public void testFreezing() {
      t.setValue(-10);
      assertTrue(t.isFreezing());
      t.setValue(10);
      assertFalse(t.isFreezing());
      t.setValue(0.01F);
      assertFalse(t.isFreezing());
      t.setValue(0F);
      assertTrue(t.isFreezing());
      t.setValue(-0.01F);
      assertTrue(t.isFreezing());
   }  

   @Test(expected=InvalidTemperatureException.class)
   public void testException() {
      t.setValue(-274F);
   }
   
   @Test
   public void testNoException() {
      t.setValue(-273F);
      t.setValue(-273.14F);
   }
   
   @Test
   public void testNoExceptionLimit() {
      t.setValue(-273.15F);
   }

   @Test(expected=InvalidTemperatureException.class)
   public void testExceptionLimit() {
      t.setValue(-273.16F);
   }
   
   @Test(expected=InvalidTemperatureException.class)
   public void testConstructorException() {
      t = new Temperature(-274F);
   }
   
}
