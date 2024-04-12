
public class Car {
	private int gear;
	private String color;
	private int speed;
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void changeGear(int gear) {
		this.gear = gear;
	}
	
	public void speedUp(int speed) {
		this.speed += speed;
	}
	
	public void speedDown(int speed) {
		this.speed -= speed;
	}
	
	public String toString() {
		return "Car [color=" + color + ", speed=" + speed + ", gear=" + gear + "]";
	}
	
}
