public class WolfTest {
	public static void main(String[] args) {
		Wolf wolf = new Wolf();
		
		wolf.gender = 'М';
		wolf.nickname = "Волчара";
		wolf.weight = 28.9f;
		wolf.age = 3;
		wolf.color = "Серый";
		
		System.out.println("Пол : " + wolf.gender);
		System.out.println("Кличка : " + wolf.nickname);
		System.out.println("Вес : " + wolf.weight);
		System.out.println("Возраст : " + wolf.age);
		System.out.println("Окрас : " + wolf.color);
		
		wolf.move();
		wolf.run();
		wolf.hunter();
		wolf.sit();
		wolf.howl();
	}
}