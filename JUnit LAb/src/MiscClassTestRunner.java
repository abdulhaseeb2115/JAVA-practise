import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MiscClassTestRunner {
	MiscClass miscObj;

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
		miscObj = null;
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("About to run a test case");
	}

	@Test
	public void test_1() {
		miscObj = new MiscClass();
		int[] arr = {1,2,3};
		int[] actual = miscObj.CopyArray(arr);
		int[] expected = arr;
		assertEquals(expected, actual);
	}

	@Test
	public void test_2() {
		miscObj = new MiscClass();
		String[] arr1= {"1","2","3"};
		String[] arr2= {"1","4","5"};
		String[] expected = {"1"};
		String[] actual = miscObj.FindCommonElemet(arr1,arr2);
		assertFalse("Test Message", actual == expected);
	}

	@Test
	public void test_3() {
		miscObj = new MiscClass();
		int[] arr1= {1,2,2,3,3,4};
		int[] expected = {2,3};
		int[] actual = miscObj.removeDuplicates(arr1);
		assertSame("Test message >", expected, actual);
	}

	@Test
	public void test_4() {
		miscObj = new MiscClass();
		int[] arr1= {1,2,3,4};
		int[] expected = {2,3};
		int[] actual = miscObj.removeSpecific(arr1,2);
		if (expected == actual) {
			fail("Failed");
		}
	}

}