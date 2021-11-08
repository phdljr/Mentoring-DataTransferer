import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class FirstFrame extends JFrame{
	
	public FirstFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("ù ��° â");
		setBounds(100, 100, 300, 200);
		getContentPane().setBackground(new Color(200, 200, 100));
		setLayout(new FlowLayout());
		
		JTextField tf = new JTextField("������ ���� �ּ���.", 10);
		add(tf);
		
		JButton btn = new JButton("������");
		btn.addActionListener((e)->{
			DataTransferer.setData("key", tf.getText());
		});
		add(btn);
		
		setVisible(true);
	}
}
