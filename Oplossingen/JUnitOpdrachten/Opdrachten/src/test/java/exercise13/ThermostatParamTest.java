package exercise13;
import static org.junit.Assert.assertEquals;
import java.io.IOException;
import java.nio.file.*;
import java.util.*;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ThermostatParamTest {
   private Temperature target;
   private Temperature current;
   private HeatingMock heating;
   private Thermostat thermostat;
   boolean isHeating;
   // @Parameters
   // public static Collection<?> getTestData() {
   // Object[][] data={{20F,15F,true},
   // {20F,25F,false},
   // {20F,20F,false}};
   // return Arrays.asList(data);
   // }

   @Parameters
   public static Collection<?> getTestData() throws IOException {
      List<Object> data = new ArrayList<>();
      Path file = Paths.get("data.csv");
      List<String> lines = Files.readAllLines(file);
      for (String line : lines) {
         String[] parts = line.split(",");
         Float f1 = new Float(parts[0]);
         Float f2 = new Float(parts[1]);
         Boolean b = new Boolean(parts[2]);
         data.add(new Object[] { f1, f2, b });
      }
      return data;
   }

   private class HeatingMock implements Heating {
      private boolean status;

      public void setHeating(boolean status) {
         this.status = status;
      }

      public boolean isHeating() {
         return status;
      }
   }

   public ThermostatParamTest(float target, float current,
      boolean isHeating) {
      this.target = new Temperature(target);
      this.current = new Temperature(current);
      this.isHeating = isHeating;
   }

   @Before
   public void init() {
      heating = new HeatingMock();
      thermostat = new Thermostat(heating);
   }

   @Test
   public void testThermostat() {
      thermostat.setCurrentTemperature(current);
      thermostat.setTargetTemperature(target);
      assertEquals(isHeating, heating.isHeating());
   }
}
