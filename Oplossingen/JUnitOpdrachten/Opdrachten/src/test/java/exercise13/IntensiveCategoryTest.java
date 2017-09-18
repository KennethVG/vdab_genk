package exercise13;

import org.junit.experimental.categories.*;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.*;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Categories.class)
@IncludeCategory(IntensiveTest.class)
@SuiteClasses({TemperatureTest.class,
               ThermostatTest.class})
public class IntensiveCategoryTest {
}
