import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Fenetre extends JFrame{
	JLabel label1,label2,label3;
  Fenetre(){
	  Font font = new Font("Segoe UI", Font.BOLD, 50);	 
	  label1 = new JLabel("Test");
	  label1.setFont(font);
	  label1.setHorizontalAlignment(JLabel.CENTER);
	  label2 = new JLabel("Test");
	  label2.setFont(font);
	  label2.setHorizontalAlignment(JLabel.CENTER);
	  label3 = new JLabel("Test");
	  label3.setFont(font);
	  label3.setHorizontalAlignment(JLabel.CENTER);

	  setLayout(new FlowLayout());
	  add(label1);
	  add(label2);
	  add(label3);

	  setSize(400,400);
	  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  setLocationRelativeTo(null);	  
	  setVisible(true);
	  
  }
  

  
}