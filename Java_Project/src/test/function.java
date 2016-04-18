package test;

public class function {
	
	int x;
	
	void pr(String s1,String s2){
		System.out.println("String1 = " + s1 + ", String2 = " + s2);
		
	}
	
	void pr(int a1,int a2,String s3){
		switch(s3){
		case "+" :
			x=a1+a2;
			System.out.println(a1 + " + " + a2 +" = " +x );
			break;
		case "-" :	
			
			if(a1>=a2){
				x=a1-a2;
				System.out.println(a1 + " - " + a2 +" = " +x );
			}
				
			else{
				x=a2-a1;					
			System.out.println(a2 + " - " + a1 +" = " +x );
			}
			break;
		
		
		case "*" :
			x=a1*a2;
			System.out.println(a1 + " * " + a2 +" = " +x );
			
		case "/" :
			if(a1>=a2){
				x=a1/a2;
				System.out.println(a1 + " / " + a2 +" = " +x );
			}
			else{
				x=a2/a1;
				System.out.println(a2 + " / " + a1 +" = " +x );
			}
			break;
		case "%" :	
			if(a1>=a2){
				x=a1%a2;
				System.out.println(a1 + " % " + a2 +" = " +x );
			}
			else{
				x=a2%a1;
				System.out.println(a2 + " % " + a1 +" = " +x );
			}
			break;
			
		}
	}
}
