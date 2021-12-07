import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Animal {
	String animalName;

	Animal(String animalName) {
		this.animalName = animalName;
	}

	void walk() {
		System.out.println("I am walking: " + animalName);
		System.out.Println("TestAAAAAAAAAAAAAAAAAAAAA");
		System.out.println("BBBBBBBBBBBBBBBBBBBBBBBBBBBBBB");
		System.out.println("A2A2A2A2A222222222222222222222");
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

class Butterfly extends Bird {

	Butterfly(String animalName) {
		super(animalName);
	}

	void sing() {
		System.out.println("I am not singing: " + animalName);
	}
}

class Caterpillar extends Bird {

	Caterpillar(String animalName) {
		super(animalName);
	}

	void fly() {
		System.out.println("I am not flying: " + animalName);
	}
}

class ModelAnimal {

	private String animalName;
	private boolean sing;
	private boolean swim;
	private boolean walk;
	private boolean fly;

	public String getAnimalName() {
		return animalName;
	}

	public void setAnimalName(String animalName) {
		this.animalName = animalName;
	}

	public boolean isSing() {
		return sing;
	}

	public void setSing(boolean sing) {
		this.sing = sing;
	}

	public boolean isSwim() {
		return swim;
	}

	public void setSwim(boolean swim) {
		this.swim = swim;
	}

	public boolean isWalk() {
		return walk;
	}

	public void setWalk(boolean walk) {
		this.walk = walk;
	}

	public boolean isFly() {
		return fly;
	}

	public void setFly(boolean fly) {
		this.fly = fly;
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
		Butterfly butterfly = new Butterfly("Butterfly");
		butterfly.fly();
		butterfly.sing();
		Caterpillar caterpillar = new Caterpillar("Caterpillar");
		caterpillar.fly();
		caterpillar.walk();
		List<ModelAnimal> animals = setValues();
		Long count=animals.stream().collect(Collectors.counting());
		
		

		long countFlyAnimals = animals.stream().filter(c -> c.isFly() == true).count();
		long countWalkAnimals = animals.stream().filter(c -> c.isWalk() == true).count();
		long countSingAnimals = animals.stream().filter(c -> c.isSing() == true).count();
		long countSwimAnimals = animals.stream().filter(c -> c.isSwim() == true).count();
		
		System.out.println("Count for Flying Animals: " + countFlyAnimals);
		System.out.println("Count for Walking Animals: " + countWalkAnimals);
		System.out.println("Count for Singing Animals: " + countSingAnimals);
		System.out.println("Count for Swiming Animals: " + countSwimAnimals);
	}

	public static List<ModelAnimal> setValues() {
		List<ModelAnimal> animals = new ArrayList<ModelAnimal>();

		ModelAnimal bird = new ModelAnimal();
		bird.setAnimalName("Bird");
		bird.setFly(true);
		bird.setSing(true);
		bird.setSwim(false);
		bird.setWalk(true);
		animals.add(bird);

		ModelAnimal duck = new ModelAnimal();
		duck.setAnimalName("Duck");
		duck.setFly(true);
		duck.setSing(true);
		duck.setSwim(true);
		duck.setWalk(true);
		animals.add(duck);

		ModelAnimal chicken = new ModelAnimal();
		chicken.setAnimalName("Chicken");
		chicken.setFly(false);
		chicken.setSing(true);
		chicken.setSwim(false);
		chicken.setWalk(true);
		animals.add(chicken);

		ModelAnimal rooster = new ModelAnimal();
		rooster.setAnimalName("Rooster");
		rooster.setFly(false);
		rooster.setSing(true);
		rooster.setSwim(false);
		rooster.setWalk(true);
		animals.add(rooster);

		ModelAnimal parrot = new ModelAnimal();
		parrot.setAnimalName("Parrot");
		parrot.setFly(true);
		parrot.setSing(true);
		parrot.setSwim(false);
		parrot.setWalk(true);
		animals.add(parrot);

		ModelAnimal fish = new ModelAnimal();
		fish.setAnimalName("Fish");
		fish.setFly(false);
		fish.setSing(false);
		fish.setSwim(true);
		fish.setWalk(false);
		animals.add(fish);

		ModelAnimal shark = new ModelAnimal();
		shark.setAnimalName("Shark");
		shark.setFly(false);
		shark.setSing(false);
		shark.setSwim(true);
		shark.setWalk(false);
		animals.add(shark);

		ModelAnimal clownfish = new ModelAnimal();
		clownfish.setAnimalName("Clownfish");
		clownfish.setFly(false);
		clownfish.setSing(false);
		clownfish.setSwim(true);
		clownfish.setWalk(false);
		animals.add(clownfish);

		ModelAnimal dolhpin = new ModelAnimal();
		dolhpin.setAnimalName("Dolhpin");
		dolhpin.setFly(false);
		dolhpin.setSing(false);
		dolhpin.setSwim(true);
		dolhpin.setWalk(false);
		animals.add(dolhpin);

		ModelAnimal dog = new ModelAnimal();
		dog.setAnimalName("Dog");
		dog.setFly(false);
		dog.setSing(true);
		dog.setSwim(false);
		dog.setWalk(true);
		animals.add(dog);

		ModelAnimal butterfly = new ModelAnimal();
		butterfly.setAnimalName("Butterfly");
		butterfly.setFly(true);
		butterfly.setSing(false);
		butterfly.setSwim(false);
		butterfly.setWalk(false);
		animals.add(butterfly);

		ModelAnimal cat = new ModelAnimal();
		cat.setAnimalName("Cat");
		cat.setFly(false);
		cat.setSing(true);
		cat.setSwim(false);
		cat.setWalk(true);
		animals.add(cat);

		return animals;

	}
}
