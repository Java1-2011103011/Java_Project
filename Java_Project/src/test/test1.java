package test;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for ( int i = 8; i>=1 ; i--){
			for(int j=1 ; j<=6; j++){
				
				if ( (i>=7) && (j==5) ){
					break; //break���� ����for���� ������ Ż���Ѵ�. 
				}
				
				if( (i>=5 && i<=6) && (j>=4 && j<=5)){
					
					continue; // ���ǹ��� �ش�Ǵ� �κи� ��ŵ�ϰ� �������� �Ѿ��. 
					
				}
				
				if (i==1 && (j>=4 && j<=5)){
					System.out.print("    ");
					continue; 
					}
				
				System.out.print(i*100 + j+" ");
			
								
					
			
			}
			
			System.out.println("");
			
		}
		System.out.println("<< �й� : 2011103011 >>");
	}
	
}
