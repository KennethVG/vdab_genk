package exercise11;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({TemperatureTest.class,
               ThermostatTest.class,
               ThermostatMockitoTest.class})
public class GeneralTest {
}
