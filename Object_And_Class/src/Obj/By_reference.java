package Obj;
//ways to initialize Objects
//1.By reference variable
 class By_reference {
	String color;
	int age ;
	public static void main(String[] args) {
		By_reference buzo = new By_reference();
		buzo.color="black";
		buzo.age=20;
		System.out.println(buzo.color+" "+buzo.age);
	}
	
}
