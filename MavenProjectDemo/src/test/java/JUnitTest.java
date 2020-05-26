

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class JUnitTest {
@BeforeClass
public static void beforeAddTest() {
	System.out.println("before add test is run ");
}
	
@Test
public void add_Test() {
	addition app = new addition();
	assertEquals(6 , app.add(4, 2));
//	assertNotEquals(500 , app.add(6, 100));
	System.out.println("Addition is done");
	
}

@After
public void afterTeast() {
	System.out.println("the add method is done");
}

@AfterClass
public static void finalTest() {
	System.out.println("All tests is done");
}
	

}
