package projektArbete;
public class LearnMock {
	private int nr1;
	private int nr2;
	public LearnMock(int nr1, int nr2) {
		this.nr1 = nr1;
		this.nr2 = nr2;
	}
	public int addition() {
		return nr1 + nr2;
	}
	public int subtraction() {
		return nr1 - nr2;
	}
	public int divided() {
		return nr1 / nr2;
	}
	public int multiplication() {
		return nr1 * nr2;
	}
}
