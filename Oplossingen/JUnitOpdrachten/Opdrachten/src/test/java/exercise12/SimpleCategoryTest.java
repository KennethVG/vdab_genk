package exercise12;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Categories.class)
@IncludeCategory(SimpleTest.class)
@ExcludeCategory(IntensiveTest.class)
@SuiteClasses({TemperatureTest.class,
               ThermostatTest.class})
public class SimpleCategoryTest {
}
