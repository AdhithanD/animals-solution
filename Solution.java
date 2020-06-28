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
	}
}