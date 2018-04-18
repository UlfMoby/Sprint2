package projektArbete;
import static org.junit.Assert.*;
import org.junit.Test;
public class TestMockensMock {
	MockensMock mock = new MockensMock("");
	
	@Test
	public void test() {
		assertTrue(mock.returnMocken().equals("this is a mockensMock"));
	}
	
	@Test
	public void test2() {
		assertTrue(mock.learnMocken("Test 2 + 2", "4").equals("4"));
	}
}
