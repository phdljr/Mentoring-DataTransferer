import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class FirstFrame extends JFrame{
	
	public FirstFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("첫 번째 창");
		setBounds(100, 100, 300, 200);
		getContentPane().setBackground(new Color(200, 200, 100));
		setLayout(new FlowLayout());
		
		JTextField tf = new JTextField("내용을 적어 주세요.", 10);
		add(tf);
		
		JButton btn = new JButton("보내기");
		btn.addActionListener((e)->{
			DataTransferer.setData("key", tf.getText());
		});
		add(btn);
		
		setVisible(true);
	}
}
