import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.JVM)
public class CalculatorTest_JVM {

	Calculator cal = new Calculator();

	@Before
	public void setUp() {
		System.out.println("settting up  Test Cases");
	}

	@Test
	public void addition() {
		assertEquals(3, cal.add(2, 1));
	}

	@Test
	public void subtraction() {
		assertEquals(5, cal.sub(10, 5));
	}

	@Test
	public void multiplication() {
		assertEquals(50, cal.mul(5, 10));
	}

	@Test
	public void division() {
		assertEquals(2, cal.div(10, 5));
	}

	@Test
	public void square() {
		assertEquals(16, cal.square(4));
	}

	@Test
	public void cube() {
		assertEquals(8, cal.cube(2));
	}

}
