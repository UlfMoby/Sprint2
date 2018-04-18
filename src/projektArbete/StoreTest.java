package projektArbete;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class StoreTest {
	/**
	 * First Test Sarmad
	 */
	@Test
	void testStoreLearnResponseFunktion() {
		Store storeTest = new Store();
		storeTest.learnResponse("add?value1=2+&value2=8", "10");
		assertEquals("10", storeTest.getResponse("add?value1=2+&value2=8"));
	}
	
	@Test
	void testStoreLearnResponseFunktion2() {
		Store storeTest = new Store();
		storeTest.learnResponse("add?value1=2+&value2=8", "10");
		assertEquals("10", storeTest.getResponse("add?value1=2+&value2=8"));
		
	}
	
	@Test
	void testNonAddedResponse() {
		Store storeTest = new Store();
		assertEquals(null, storeTest.getResponse("add?value1=2+&value2=8"));
	}
	
	@Test
	void testStoreUnlearn() {
		Store storeTest = new Store();
		storeTest.learnResponse("add?value1=2+&value2=8", "10");
		storeTest.unlearnAll();
		assertEquals(null, storeTest.getResponse("add?value1=2+&value2=8"));
	}
	
	@Test
	void testStoreNull() {
		Store storeTest = new Store();
		storeTest.learnResponse("", "");
		assertEquals("", storeTest.getResponse(""));
	}
	
	

}
