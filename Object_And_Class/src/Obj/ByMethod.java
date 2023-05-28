package Obj;

public class ByMethod {

	String color;
	int age ;
	void intObj(String c,int a) {
		color=c;
		age= a;
	}
	void display() {
		System.out.println(color+" "+age);
	}
	public static void main(String[] args) {
		ByMethod buzo = new ByMethod();
		buzo.intObj("black", 21);
		buzo.display();
	}
}
