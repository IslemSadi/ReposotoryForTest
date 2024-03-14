package exercice118;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Window extends JFrame implements ActionListener{
	JButton Increase,Decrease;
	JPanel DisplayingPanel;
	JLabel value,Sequence;
	double number,result;
	
	
	Window(){
		this.Increase = new JButton("N++");
		this.Increase.addActionListener(this);
		this.Decrease = new JButton("N--");
		this.Decrease.addActionListener(this);
		
		
		this.value = new JLabel("n = "+this.number);
		this.Sequence = new JLabel("Serie = "+this.result);
		
		
		this.DisplayingPanel = new JPanel();
		this.DisplayingPanel.add(value);
		this.DisplayingPanel.add(Sequence);
		this.DisplayingPanel.setBackground(Color.CYAN);
		
		
		this.setVisible(true);
		this.setTitle("Serie Harmonique");
		this.setSize(400,300);
		this.setLocationRelativeTo(null);
	    this.setLayout(new BorderLayout());
	    this.add(Increase,BorderLayout.NORTH);
	    this.add(DisplayingPanel,BorderLayout.CENTER);
	    this.add(Decrease,BorderLayout.SOUTH);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		if(e.getSource().equals(this.Increase)) {
			this.number++;
			this.value.setText(String.valueOf("n = "+this.number));
			this.result = this.result + (1/this.number);
			this.Sequence.setText(String.valueOf("Serie = "+this.result));
		}
		
		
		if(e.getSource().equals(this.Decrease) && this.number > 0) {
			this.number--;
			this.value.setText(String.valueOf("n = "+this.number));
			this.result = this.result - (1/this.number);
			if(this.result < 0) {
				this.result = 0;
			}
			this.Sequence.setText(String.valueOf("Serie = "+this.result));
		}
	}

}
