public class GuessNumber {
	private int number;
	
	public GuessNumber() {
		number = (int)(Math.random() * 100 + 1);
	}
	
	public int getNumber() {
		return number;
	}
}