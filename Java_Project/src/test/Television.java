package test;

public class Television {
	int channel;
	int volume;
	boolean onOff;
	
	void pr(){
		if(onOff==false){
			System.out.println("TV die");
			return;
		}
		System.out.println(channel + " " + volume + " " + onOff);
		
	}
	
//	int volumeUP(int up_data){
//		int vol=volume;
//		vol += up_data;
//		return vol;
		
//	}
	
	void volumeUP(int data){
		if(onOff==false){
			System.out.println("TV die");
			return;
		}
		volume += data;
		
	}
	
	void volumeUP(){
		if(onOff==false){
			System.out.println("TV die");
			return;
		}
		volume += 1;
	}
	
}
