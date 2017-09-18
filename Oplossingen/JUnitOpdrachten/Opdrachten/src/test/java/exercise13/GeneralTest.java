package exercise13;

import org.junit.runner.*;
import org.junit.runners.*;
import static org.junit.runners.Suite.*;


@RunWith(Suite.class)
@SuiteClasses({TemperatureTest.class,
               ThermostatTest.class})
public class GeneralTest {
}
