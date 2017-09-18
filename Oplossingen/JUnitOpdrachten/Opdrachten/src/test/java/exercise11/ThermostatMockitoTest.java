package exercise11;

import static org.mockito.Mockito.*;
import org.junit.*;
import org.junit.runner.RunWith;
import org.mockito.*;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class ThermostatMockitoTest {
   @InjectMocks
   private Thermostat thermostat;
   
   @Mock
   private Heating heating;

   @Before
   public void init() {
      Temperature target = new Temperature(20F);
      thermostat.setTargetTemperature(target);
      reset(heating);      
   }

   @Test
   public void testHeatingControlOn() {
      Temperature current = new Temperature(15F);
      thermostat.setCurrentTemperature(current);
      verify(heating).setHeating(true);
   }

   @Test
   public void testHeatingControlOff() {
      Temperature current = new Temperature(25F);
      thermostat.setCurrentTemperature(current);
      verify(heating).setHeating(false);
   }
   
   @Test
   public void testHeatingControl() {
      thermostat.setCurrentTemperature(new Temperature(25F));
      verify(heating).setHeating(false);
      reset(heating);
      thermostat.setCurrentTemperature(new Temperature(15F));
      verify(heating).setHeating(true);
      reset(heating);
      thermostat.setCurrentTemperature(new Temperature(-105F));
      verify(heating).setHeating(true);
      reset(heating);
      thermostat.setCurrentTemperature(new Temperature(20F));
      verify(heating).setHeating(false);      
   }

}
