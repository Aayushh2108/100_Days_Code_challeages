package Abstract;

abstract class Shape{
	abstract void draw(); 
}
class Rectangle extends Shape
	void draw() {
		System.out.println("Drwaing rectangle");
	}
}
class Circle1 extends Shape{
	void draw() {
		System.out.println("Drawing Cicle");
	}
}
class AbstractExxample2{
	public static void main(String[] args) {
		Shape r= new Rectangle();
		r.draw();
		Shape s =new Circle1();
		s.draw();
	}
}
