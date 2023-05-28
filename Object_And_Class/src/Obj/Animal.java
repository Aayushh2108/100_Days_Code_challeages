package Obj;

class Animal {
	public void run() {
		System.out.println("I am Running");
	}

	public static void main(String[] args) {

		System.out.println("1");
		Animal buzo = new Animal();
		buzo.run();
		buzo.eat();
		Birds sp = new Birds();
		sp.fly();
	}

	public void eat() {
		System.out.println("I am Eating");
	}
}
class Birds{
	void fly() {
		System.out.println("I am flying");
	}
}
