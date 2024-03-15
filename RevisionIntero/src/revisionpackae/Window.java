package revisionpackae;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Window extends JFrame{
	
	//The Constructor Of Window Class
	Window(){
		//Basic Operations On Window
		this.setSize(250,250);
		this.setLocationRelativeTo(null);
		this.setTitle("BOUTONS");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.getContentPane().setBackground(Color.CYAN);;
		
		
		int ButtonsNumber = Integer.parseInt(JOptionPane.showInputDialog("Enter The Number Of Buttons : "));
		
		
		//Adding Buttons Through For Loop
		for(int i=1;i<=ButtonsNumber;i++) {
			this.add(new JButton("Button "+(i)));
		}
	}


}
