package exercise13;

import static org.junit.Assert.*;
import org.junit.*;

public class ThermostatTest {
   private Thermostat thermostat;
   private HeatingMock heating;

   private class HeatingMock implements Heating {
      private boolean status;

      public void setHeating(boolean status) {
         this.status=status;
      }

      public boolean isHeating() {
         return status;
      }
   }

   @Before
   public void init() {
      heating = new HeatingMock();
      thermostat=new Thermostat(heating);
   }

   @Test
   public void testChangeCurrent() {
      Temperature target = new Temperature(20F);
      Temperature current = new Temperature(0);
            
      thermostat.setTargetTemperature(target);    
      
      for (float t = 15; t < 20; t += 0.1F) {
         current.setValue(t);
         thermostat.setCurrentTemperature(current);
         assertTrue(thermostat.isHeating());
      }
      for (float t = 20; t < 25; t += 0.1F) {
         current.setValue(t);
         thermostat.setCurrentTemperature(current);
         assertFalse(thermostat.isHeating());
      }
      for (float t = 25; t >= 20; t -= 0.1F) {
         current.setValue(t);
         thermostat.setCurrentTemperature(current);
         assertFalse(thermostat.isHeating());
      }
      for (float t = 19.9F; t >= 15; t -= 0.1F) {
         current.setValue(t);
         thermostat.setCurrentTemperature(current);
         assertTrue(thermostat.isHeating());
      }
   }
   
   @Test
   public void testChangeTarget() {
      Temperature target = new Temperature(0F);
      Temperature current = new Temperature(20F);
      thermostat.setCurrentTemperature(current);
      
      for (float t = 15; t <= 20; t += 0.1F) {
         target.setValue(t);
         thermostat.setTargetTemperature(target);
         assertFalse(thermostat.isHeating());
      }
      for (float t = 20.01F; t < 25; t += 0.1F) {
         target.setValue(t);
         thermostat.setTargetTemperature(target);
         assertTrue(thermostat.isHeating());
      }
      for (float t = 25; t > 20; t -= 0.1F) {
         target.setValue(t);
         thermostat.setTargetTemperature(target);
         assertTrue(thermostat.isHeating());
      }
      for (float t = 20F; t >= 15; t -= 0.1F) {
         target.setValue(t);
         thermostat.setTargetTemperature(target);
         assertFalse(thermostat.isHeating());
      }      
   }
   
   @Test
   public void testHeatingControl(){
      Temperature target = new Temperature(20F);
      Temperature current = new Temperature(15F);
      
      thermostat.setCurrentTemperature(current);
      thermostat.setTargetTemperature(target);      
      assertTrue(heating.isHeating());

      current.setValue(25F);
      thermostat.setCurrentTemperature(current);
      assertFalse(heating.isHeating());
   }
}
