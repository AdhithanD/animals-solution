class Animal {
	void walk() {
		System.out.println("I am walking");
	}
}

class Bird extends Animal {
	String flyMsg, singMsg;
	Bird(String flyMsg, String singMsg){
		this.flyMsg = flyMsg;
		this.singMsg = singMsg;
	}
	void fly() {
		System.out.println(flyMsg);
	}

	void sing() {
		System.out.println(singMsg);
	}
}


public class Solution {
	public static void main(String[] args) {
		Bird bird = new Bird("I am flying", "I am singing");
		bird.walk();
		bird.fly();
		bird.sing();
	}
}