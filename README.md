# java_Inheritance

Practicing java inheritance concepts.

### Car

We've defined a Car with a sound and a make. We made a Ferrari class that extends the Car class. A Car will "roar" whereas a Ferrari will "purr."

Below in the Ferrari main function, we've casted a Ferrari as a Car. What sound will it make?

```

	public static void main(String[] args) {
		Car a = new Car();
		a.sound();
		
		Ferrari f = new Ferrari();
		f.sound();
		
		Car x = (Car) f;
		x.sound();
	}
  
```

Car a will "roar." Ferrari f will "purr." and Car x will also "purr"! This is because a Ferrari is already a Car.

Back to the Car class, in the main function, we've made a new Car with it's own 

```
until finished
```


