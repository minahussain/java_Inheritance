public class Car {
	
	private String make;
//	public abstract void start();
	
	public void sound() {
		System.out.println("roar");
	}

	public void setMake(String make){
		this.make = make;
	}
	
	public String getMake() {
		return make;
	}
	
	public static void main(String[] args){
	
		Car Hybrid = new Car() {
			private int batteryPower;

			@Override
			public void start() {
				batteryPower -= 100;
				System.out.println("okay");
			}
		};
		
//		int x = Hybrid.batteryPower; //doesn't work bc cant access batteryPower
		
		Hybrid.start(); //works!
	}
}
