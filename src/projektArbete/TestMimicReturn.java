package projektArbete;
import static org.junit.Assert.*;
import org.junit.Test;
public class TestMimicReturn {
	
   RequestResponse callAndResponse = new RequestResponse("Mamma", "Pappa");
	
	@Test
	public void testRequest() {
		assertTrue(callAndResponse.getRequest().equals("Mamma"));
	}
   
   @Test
	public void testResponse() {
		assertTrue(callAndResponse.getResponse().equals("Pappa"));
	}
   
   // test request and return with null
	
	RequestResponse callAndNull = new RequestResponse(null, null);
	
	@Test
	public void testRequestNull() {
		assertTrue(callAndNull.getRequest().equals(null));
	}
   
   	@Test
	public void testResponseNull() {
		assertTrue(callAndNull.getResponse().equals(null));
	// expect a message like “wrong input” 
	}


}
