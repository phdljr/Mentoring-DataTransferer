import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class SecondFrame extends JFrame{
	
	public SecondFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("두 번째 창");
		setBounds(400, 100, 300, 200);
		getContentPane().setBackground(new Color(200, 100, 100));
		setLayout(new FlowLayout());
		
		JTextField tf = new JTextField(10);
		add(tf);
		
		JButton btn = new JButton("받기");
		btn.addActionListener((e)->{
			tf.setText(DataTransferer.getData("key"));
		});
		add(btn);
		
		setVisible(true);
	}
}
