public class WolfTest {
	public static void main(String[] args) {
		Wolf wolf = new Wolf();
		Wolf wolf1 = new Wolf();
		Wolf wolfTest = new Wolf();
		Wolf wolfNew = new Wolf();
		
		wolf.setGender('m');
		wolf.setNickname("");
		wolf.setWeight(-1);
		wolf.setAge(9);
		wolf.setColor("");
		
		System.out.println(wolf.getGender());
		System.out.println(wolf.getNickname());
		System.out.println(wolf.getWeight());
		System.out.println(wolf.getAge());
		System.out.println(wolf.getColor());
		
		System.out.println();
		
		wolf1.setGender('w');
		wolf1.setNickname("");
		wolf1.setWeight(3);
		wolf1.setAge(-1);
		wolf1.setColor("");
		
		System.out.println(wolf1.getGender());
		System.out.println(wolf1.getNickname());
		System.out.println(wolf1.getWeight());
		System.out.println(wolf1.getAge());
		System.out.println(wolf1.getColor());
		
		System.out.println();
		
		wolfTest.setGender('w');
		wolfTest.setNickname("Волчара");
		wolfTest.setWeight(15);
		wolfTest.setAge(3);
		wolfTest.setColor("Серый");
		
		System.out.println(wolfTest.getGender());
		System.out.println(wolfTest.getNickname());
		System.out.println(wolfTest.getWeight());
		System.out.println(wolfTest.getAge());
		System.out.println(wolfTest.getColor());
		
		System.out.println();
		
		wolfNew.setGender('w');
		wolfNew.setNickname("");
		wolfNew.setWeight(13);
		wolfNew.setAge(2);
		wolfNew.setColor("Черный");
		
		System.out.println(wolfNew.getGender());
		System.out.println(wolfNew.getNickname());
		System.out.println(wolfNew.getWeight());
		System.out.println(wolfNew.getAge());
		System.out.println(wolfNew.getColor());
		
		System.out.println();
		
		wolf.move();
		wolf1.run();
		wolf.hunter();
		wolfTest.sit();
		wolf.howl();
	}
}