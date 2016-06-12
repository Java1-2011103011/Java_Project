package Sample_0613_1;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
	public MyFrame(){
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize(); //���� ȭ���� ũ�⸦ ��´�.
		
		setSize(300,200);
		setLocation(screenSize.width/2,screenSize.height/2); //�������� ��ġ�� ���� ȭ���� �߾����� �Ѵ�.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("MyFrame");
		
		setLayout(new FlowLayout());
		JButton button = new JButton("��ư");
		this.add(button);
		setVisible(true);
	}
}
