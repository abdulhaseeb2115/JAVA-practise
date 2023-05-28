import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;


@FixMethodOrder(MethodSorters.JVM)
public class TCS_JVM {
	static Tcs tcs;
	
    @Before
    public void setUp() {
        System.out.println("settting up  Test Cases");
    }
    @BeforeClass
    public static void runBeforeAll() {
        tcs = new Tcs("national", 3, 001, "Lahore",250);
    }

    @AfterClass
    public static void runAfterAll() {
    	System.out.println("All the Cases are Correct");
    }
    
    @Test
    public void TC_1() {
        assertEquals(256, tcs.DeliveryCost());
    }
	
	@Test
    public void TC_2() {
        assertEquals(256, tcs.DeliveryCost());
    }
	
	@Test
    public void TC_3() {
        assertEquals(256, tcs.DeliveryCost());
    }
    
}
