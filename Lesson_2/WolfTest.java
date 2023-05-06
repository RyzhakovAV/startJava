public class WolfTest {
	public static void main(String[] args) {
		Wolf wolf = new Wolf();
		Wolf wolf1 = new Wolf();
		
		wolf.setNickname("");
		
		System.out.println(wolf.getNickname());
		
		wolf1.setNickname("");
		
		System.out.println(wolf1.getNickname());
		
		wolf.move();
		wolf.run();
		wolf.hunter();
		wolf.sit();
		wolf.howl();
	}
}