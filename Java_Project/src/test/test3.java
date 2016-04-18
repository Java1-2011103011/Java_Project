package test;

import java.util.Scanner;

public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		int a1,a2;
		String s1,s2,s3;
		Scanner input = new Scanner(System.in);
		
		function f1 = new function();
		
				
		do{ 
		System.out.println("1. Input String");
		System.out.println("2. Input Operation");
		System.out.println("3. Quit");
		System.out.print("메뉴를 선택하시오 : ");
		number = input.nextInt();
		
		switch(number){
		case 1 :
			System.out.print("1. Input String1 : "); s1 = input.next();
			System.out.print("2. Input String2 : "); s2 = input.next();
			f1.pr(s1, s2); 
				
			
			break;
			
		case 2 :
			System.out.print("1. Input Oprand1 : "); a1 = input.nextInt();
			System.out.print("2. Input Oprand2 : "); a2 = input.nextInt();
			System.out.print("3. Input Operator : "); s3 = input.next();
			f1.pr(a1, a2, s3);
			
			break;
		case 3 :
			System.out.println("Quit");
			break;
		}
			
	}while(number !=3 );
		
	}
}
