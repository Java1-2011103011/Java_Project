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
		
		//System.out.println("�ڷ������� ä���� " + mytv.channel + "�̰� ������ " + mytv.volume + "�Դϴ�.");
		mytv.pr();
		
		yourtv.channel = 23;
		yourtv.volume = 12;
		yourtv.onOff = true ; 
		
		yourtv.pr();
		//System.out.println("�ڷ������� ä���� " + yourtv.channel + "�̰� ������ " + yourtv.volume + "�Դϴ�.");
		
		mytv.channel = 231;
		//System.out.println("�ڷ������� ä���� " + testtv.channel + "�̰� ������ " + testtv.volume + "�Դϴ�.");
		testtv.pr();
		
	}

}
