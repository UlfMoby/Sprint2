package projektArbete;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StoreTest {
	/**
	 * First Test Sarmad
	 */
	@Test
	public void testStoreLearnResponseFunktion() {
		Store storeTest = new Store();
		storeTest.learnResponse("add?value1=2+&value2=8", "10");
		assertEquals("10", storeTest.getResponse("add?value1=2+&value2=8"));
	}
	
	@Test
	public void testStoreLearnResponseFunktion2() {
		Store storeTest = new Store();
		storeTest.learnResponse("add?value1=2+&value2=8", "10");
		assertEquals("10", storeTest.getResponse("add?value1=2+&value2=8"));
		
	}
	
	@Test
	public void testNonAddedResponse() {
		Store storeTest = new Store();
		assertEquals(null, storeTest.getResponse("add?value1=2+&value2=8"));
	}
	
	@Test
	public void testStoreUnlearn() {
		Store storeTest = new Store();
		storeTest.learnResponse("add?value1=2+&value2=8", "10");
		storeTest.unlearnAll();
		assertEquals(null, storeTest.getResponse("add?value1=2+&value2=8"));
	}
	
	@Test
	public void testStoreNull() {
		Store storeTest = new Store();
		storeTest.learnResponse("", "");
		assertEquals("", storeTest.getResponse(""));
	}
	
	

}
