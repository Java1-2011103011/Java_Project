package test;

public class TelevisionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Television mytv = new Television();
		Television yourtv = new Television();
		Television testtv = mytv;
		
		mytv.channel = 18;
		mytv.volume = 20;
		mytv.onOff = true;
		
		mytv.volumeUP();
		mytv.volumeUP();
		
		//System.out.println("텔레비전의 채널은 " + mytv.channel + "이고 볼륨은 " + mytv.volume + "입니다.");
		mytv.pr();
		
		yourtv.channel = 23;
		yourtv.volume = 12;
		yourtv.onOff = true ; 
		
		yourtv.pr();
		//System.out.println("텔레비전의 채널은 " + yourtv.channel + "이고 볼륨은 " + yourtv.volume + "입니다.");
		
		mytv.channel = 231;
		//System.out.println("텔레비전의 채널은 " + testtv.channel + "이고 볼륨은 " + testtv.volume + "입니다.");
		testtv.pr();
		
	}

}
