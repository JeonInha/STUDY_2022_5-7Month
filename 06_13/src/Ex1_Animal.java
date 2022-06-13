class Animal {
	
	public void sleep() {
		System.out.println("z.. z.. Z.. Z");
	}
	
	public void eat() {
		System.out.println("yum yummy");
	}
}

class Dog extends Animal {
	public void bark() {
		System.out.println("bow-wow!");
	}
}

class Cat extends Animal {
	public void play() {
		System.out.println("  /\\/\\");
		System.out.println("=( '^')=");
		System.out.println("          ⊃      ⊃  ... ᘛ⁐̤ᕐᐷ\r\n" + 
				" ");
	}
}
public class Ex1_Animal {
	public static void main(String[] args) {
	Cat kitty =new Cat();
	kitty.play();
	}
}
