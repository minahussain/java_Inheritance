
public class Ferrari extends Car {

	@Override
	public void start() {
	}
	
	@Override
	public void sound() {
		System.out.println("purr");
	}


	public static void main(String[] args) {
		Car a = new Car();
		a.sound();
		
		Ferrari f = new Ferrari();
		f.sound();
		
		Car x = (Car) f;
		x.sound();
	}

}