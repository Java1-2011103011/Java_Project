package Sample_0509;

class Par{
	Par() { System.out.println("Par Con");}
	Par(int x) { System.out.println("Par con "+ x); }
	
}

class child extends Par{
	public child(int y){
		super(y);
		System.out.println("child con");
	}
	public child() {System.out.println("child con nothing");}
}

public class Con_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child c1 = new child(5);
		child c2 = new child(); // 꼭 만들어 주어야 함.
	}

}
