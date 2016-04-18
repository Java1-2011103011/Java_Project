package test;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for ( int i = 8; i>=1 ; i--){
			for(int j=1 ; j<=6; j++){
				
				if ( (i>=7) && (j==5) ){
					break; //break문은 내부for문을 완전히 탈출한다. 
				}
				
				if( (i>=5 && i<=6) && (j>=4 && j<=5)){
					
					continue; // 조건문에 해당되는 부분만 스킵하고 다음으로 넘어간다. 
					
				}
				
				if (i==1 && (j>=4 && j<=5)){
					System.out.print("    ");
					continue; 
					}
				
				System.out.print(i*100 + j+" ");
			
								
					
			
			}
			
			System.out.println("");
			
		}
		System.out.println("<< 학번 : 2011103011 >>");
	}
	
}
