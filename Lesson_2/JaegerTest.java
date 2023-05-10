public class JaegerTest {
	public static void main(String[] args) {
		Jaeger cherno = new Jaeger("Cherno Alpha", "Mark-1", "Russia", 85.34f, 2412, 3, 10, 10);
		
		
		System.out.println(cherno.start());
		System.out.println(cherno.go());
		cherno.scanner();
	}
}