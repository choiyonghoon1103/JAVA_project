
public class CarTest {

	public static void main(String[] args) {
		Car c1 = new Car();
		c1.setColor("red");
		c1.changeGear(2);
		c1.speedUp(80);
		String a = c1.toString();
		System.out.println(a);
	}

}
