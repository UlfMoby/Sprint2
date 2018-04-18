package projektArbete;
import static org.junit.Assert.*;
import org.junit.Test;
public class TestLearnMock {
	LearnMock mock1 = new LearnMock(8, 2);
	LearnMock mock2 = new LearnMock(3, 2);
	LearnMock mock3 = new LearnMock(9, 3);
	LearnMock mock4 = new LearnMock(5, 5);
	@Test
	public void test1() {
		assertTrue(mock1.addition()==10);
	}
	@Test
	public void test2() {
		assertTrue(mock2.subtraction()==1);
	}
	@Test
	public void test3() {
		assertTrue(mock3.divided()==3);
	}
	@Test
	public void test4() {
		assertTrue(mock4.multiplication()==25);
	}
}
//ikuer giokgubsrthgiebi