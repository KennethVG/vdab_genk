package be.oak3.calc;

import com.javatunes.Calc;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalcTest {
  Calc calc = new Calc();
  
  @Test
  public void addNormalValues() {
	// TODO - add methods to test calc.add() with normal values
  }

  @Test
  public void divWholeResults() {
	// TODO - add methods to test calc.div() with values that yield whole numbers (e.g. 4/2)
  }

  @Test // TODO add "expected" attribute
  public void divByZero() {
	// TODO - add call to calc.div to divide by zero
  }  

  @Test
  public void divFractionalResults() {
    // TODO - add methods to test calc.div() with values that yield fractional numbers (e.g. 1/3)
	// You'll want to use the assertEquals(double d1, double d2, double delta) method
  }

  @Test
  public void addTo_MAX_VALUE() {
	// TODO - add methods to test calc.add() by adding something to Long.MAX_VALUE
  }

}