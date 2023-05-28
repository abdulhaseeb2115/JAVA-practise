import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestRunner {
	BankAccount accountObj;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("About to run test cases");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("Ran all test cases");
	}

	@After
	public void tearDown() throws Exception {
		accountObj = null;
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("About to run a test case");
	}

	@Test
	public void test_1() {
		accountObj = new BankAccount(111, 1000);
		String actual = accountObj.Withdraw(1000);
		String expected = "1000.0 Has Been Deducted From Balance";
		assertEquals(expected,actual);
	}
	
	@Test
	public void test_2() {
		accountObj= new BankAccount(111, 1000);
		accountObj.Deposit(1000);
		double expected = 2000;
		double actual = accountObj.Checkbal();
		assertFalse("Test Message", actual > expected);
	}
	
	@Test
	public void test_3() {
		accountObj= new BankAccount(111, 1000);
		accountObj.Deposit(1000);
		double expected = 2000.0;
		double actual = accountObj.Checkbal();
		assertSame("Test message >", expected, actual);
	}

	@Test
	public void test_4() {
		accountObj= new BankAccount(111, 1000);
		accountObj.Deposit(1000);
		double expected = 1500;
		double actual = accountObj.Checkbal();
		if(expected >= actual) {
			fail("Failed");
		}
	}
	

}