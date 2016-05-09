package Sample_0509;

class Animal_{
	void sound() { System.out.println("Ani");}
}

class Dog extends Animal_{
	void sound() { System.out.println("Dog");}
}

class Cat extends Animal_{
	void sound() {System.out.println("Cat");}
	
}


public class Dynamic_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal_ a= new Animal_();
		Animal_ b = new Dog();
		Animal_ c = new Cat();
		a.sound(); b.sound(); c.sound();
		test(a); test(b); test(c);
	}
	static void test(Animal_ temp) {
		temp.sound();
	}
 }
