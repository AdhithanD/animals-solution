class Animal {
	String animalName;

	Animal(String animalName) {
		this.animalName = animalName;
	}

	void walk() {
		System.out.println("I am walking: " + animalName);
	}
}

class Bird extends Animal {
	Bird(String animalName) {
		super(animalName);
	}

	void fly() {
		System.out.println("i am flying: " + animalName);
	}

	void sing() {
		System.out.println("i am singing: " + animalName);
	}

	void swim() {
		System.out.println("can swim: " + animalName);
	}

	void cannotFly() {
		System.out.println("cannot fly: " + animalName);
	}

}

class Duck extends Bird {

	Duck(String animalName) {
		super(animalName);
	}

	void say() {
		System.out.println("Quack, quack: " + animalName);
	}
}

class Chicken extends Bird {
	Chicken(String animalName) {
		super(animalName);
	}

	void say() {
		System.out.println("Cluck, cluck : " + animalName);
	}

}

class Rooster extends Bird {
	Rooster(String animalName) {
		super(animalName);
	}

	void say() {
		System.out.println("Cock-a-doodle-doo : " + animalName);
	}

}

class Parrot extends Bird {

	Parrot(String animalName) {
		super(animalName);
	}

}

class Dog extends Animal {

	Dog(String animalName) {
		super(animalName);
	}

	void say() {
		System.out.println("Woof, woof : " + animalName);
	}

}

class Cat extends Animal {

	Cat(String animalName) {
		super(animalName);
	}

	void say() {
		System.out.println("Meow : " + animalName);
	}

}

class Fish extends Animal {

	Fish(String animalName) {
		super(animalName);
	}

	void walk() {
		System.out.println("i am not walking: " + animalName);
	}

	void sing() {
		System.out.println("i am not singing: " + animalName);
	}

	void swim() {
		System.out.println("can swim: " + animalName);
	}

	void specialize(String colour, String size, String others) {
		System.out.println(animalName + " Colour:" + colour + ", Size: " + size + ",  " + others);
	}

}

class Shark extends Fish {

	Shark(String animalName) {
		super(animalName);
	}

	@Override
	void specialize(String colour, String size, String others) {
		super.specialize(colour, size, others);
	}
}

class Clownfish extends Fish {

	Clownfish(String animalName) {
		super(animalName);
	}

	@Override
	void specialize(String colour, String size, String others) {
		super.specialize(colour, size, others);
	}
}

class Dolphins extends Animal {

	Dolphins(String animalName) {
		super(animalName);
	}
	
	void swim() {
		System.out.println("can swim: " + animalName);
	}
}

public class Solution {
	public static void main(String[] args) {
		Bird bird = new Bird("Bird");
		bird.walk();
		bird.fly();
		bird.sing();
		Duck duck = new Duck("Duck");
		Chicken chicken = new Chicken("Chicken");
		duck.say();
		duck.swim();
		chicken.say();
		chicken.cannotFly();
		Rooster rooster = new Rooster("Rooster");
		rooster.say();
		Dog dog = new Dog("Dog");
		dog.say();
		Cat cat = new Cat("Cat");
		cat.say();
		rooster.say();
		Fish fish = new Fish("Fish");
		fish.sing();
		fish.walk();
		fish.swim();
		Shark shark = new Shark("Shark");
		Clownfish clownfish = new Clownfish("Clownfish");
		shark.specialize("grey", "large", "eat other fish");
		clownfish.specialize("orange", "small", "make jokes");
		Dolphins dolphins = new Dolphins("Dolphins");
		dolphins.swim();
	}
}