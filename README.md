# java_Inheritance

Practicing java inheritance concepts.

### Car

## overriding functions

We've defined a Car with a sound and a make.

```
public class Car {
	
	private String make;
	
	public void sound() {
		System.out.println("roar");
	}
	
	public void start() {
		// does nothing
	}

	public void setMake(String make){
		this.make = make;
	}
	
	public String getMake() {
		return make;
	} 

```

We made a Ferrari class that extends the Car class. This allows it to inherit functions from the Car class. However, to alter the Car functions for Ferraris, we must Override the Car ones.

```
public class Ferrari extends Car {

	@Override
	public void start() {
	}
	
	@Override
	public void sound() {
		System.out.println("purr");
	}
```

Below in the Ferrari main function, we've casted a Ferrari as a Car. What sound will it make?

```
	public static void main(String[] args) {
		Car a = new Car();
		a.sound(); //roar
		
		Ferrari f = new Ferrari();
		f.sound(); //purr
		
		Car x = (Car) f;
		x.sound(); //purr
	}
  
```

Car x will also "purr"-- this is because a Ferrari is already a Car!

## accessing variables

Back to the Car class, in the main function, we've made a new Car called Hybrid. We defined it's start function to access a private variable batteryPower. 

Will we be able to access batteryPower later?

Do we also have to Override start?

```
public static void main(String[] args){
	
		Car Hybrid = new Car() {
			private int batteryPower;

			@Override
			public void start() {
				batteryPower -= 100;
				System.out.println("started");
			}
		};
		
/*		int x = Hybrid.batteryPower; doesn't work bc cant access batteryPower */
		
		Hybrid.start(); //works!
	}
}
```
We get an error if we try to access Hybrid.batteryPower since it is a private variable. We cannot access it outside of the anonymous function.



