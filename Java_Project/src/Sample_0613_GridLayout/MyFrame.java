package Sample_0613_GridLayout;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
	public MyFrame() {
		
		setTitle("GridLayoutTest");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new GridLayout(0,3));//3���� ���� �ʿ��� ��ŭ�� ���� ������  GridLayout�� �����Ѵ�. ���� ������ ������ �����Ϸ��� GridLayout(0,3,2,2)�� ���� �Ѵ�.
		
		add(new JButton("Button1"));
		add(new JButton("Button2"));
		add(new JButton("Button3"));
		add(new JButton("B4"));
		add(new JButton("Long Button5"));
		
		pack();
		setVisible(true);
	}
	
}
