package exercice105;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Window extends JFrame implements ActionListener{
	JButton Add,Remove;
	JPanel PanelButtons;
	ArrayList<JButton> Buttons;
	
	
	Window(){
		this.Buttons = new ArrayList<>();
		this.Add = new JButton("CREATION");
		this.Remove = new JButton("SUPPRESSION");
		this.PanelButtons = new JPanel();
		this.PanelButtons.setLayout(new FlowLayout());
		this.PanelButtons.setBackground(Color.CYAN);
		
		
		this.Add.addActionListener(this);
		this.Remove.addActionListener(this);
		
		
		this.setVisible(true);
		this.setTitle("Creation-Suppression de Buttons (Maxi 50 )");
		this.setSize(600,400);
		this.setLocationRelativeTo(null);
		this.setLayout(new BorderLayout());
		this.add(Add,BorderLayout.NORTH);
		this.add(PanelButtons,BorderLayout.CENTER);
		this.add(Remove,BorderLayout.SOUTH);
	}

    
	public void AddButton() {
		JButton btn = new JButton("BOUTON "+(Buttons.size()+1));
		btn.setBackground(Color.YELLOW);
		btn.addActionListener(this);
		this.Buttons.add(btn);
		this.PanelButtons.add(btn);
		this.PanelButtons.revalidate();
	}
	
	
	public void RemoveButton() {
		for(JButton btn : this.Buttons) {
			if(btn.getBackground().equals(Color.RED)) {
				this.PanelButtons.remove(btn);
				this.PanelButtons.repaint();
				this.PanelButtons.revalidate();
			}
		}
	}
	
	
	public void SelectButton(ActionEvent e) {
		for(JButton btn : this.Buttons) {
			if(e.getSource().equals(btn)) {
				btn.setBackground(Color.RED);
			}
		}
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(Add)) {
			this.AddButton();
		}
		else if(e.getSource().equals(Remove)) {
			this.RemoveButton();
		}
		else {
			this.SelectButton(e);
		}
	}

}
