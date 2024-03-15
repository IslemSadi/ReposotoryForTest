package exercice106;

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
	JButton BigButtons,SmallButtons;
	JPanel Board;
	int BigButtonsNumber;
	ArrayList<JButton> GrandsBoutons;
	ArrayList<JButton> PetitsBoutons;
	
	
	Window(){
		this.GrandsBoutons = new ArrayList<>();
		this.PetitsBoutons = new ArrayList<>();
		this.BigButtons = new JButton("GROS BOUTON");
		this.SmallButtons = new JButton("PETIT BOUTON");
		this.BigButtons.addActionListener(this);
		this.SmallButtons.addActionListener(this);
		this.Board = new JPanel();
		this.Board.setLayout(new FlowLayout());
		this.Board.setBackground(Color.CYAN);
		
		
		this.setVisible(true);
		this.setSize(600,400);
		this.setLocationRelativeTo(null);
		this.setTitle("Gros et Petits Boutons");
		this.setLayout(new BorderLayout());
		this.add(BigButtons,BorderLayout.NORTH);
		this.add(Board,BorderLayout.CENTER);
		this.add(SmallButtons,BorderLayout.SOUTH);
	}

    
	public void GrosButton() {
		if(this.BigButtonsNumber == 5) {
			this.BigButtonsNumber = 0;
			for(JButton btn : this.GrandsBoutons) {
				this.Board.remove(btn);
				this.Board.repaint();
				this.Board.revalidate();
			}
			this.GrandsBoutons.clear();
		}
		this.BigButtonsNumber++;
		JButton button = new JButton();
		button.setText("COMPTE = "+String.valueOf(BigButtonsNumber));
		this.Board.add(button);
		this.GrandsBoutons.add(button);
		this.Board.repaint();
		this.Board.revalidate();
	}
	
	
	public void PetitButton() {
		JButton button = new JButton();
		button.setText("Petit");
		button.addActionListener(this);
		this.Board.add(button);
		this.PetitsBoutons.add(button);
		this.Board.repaint();
		this.Board.revalidate();
	}
	
	
	public void RemoveSmallButtons(ActionEvent e) {
		for(JButton btn : this.PetitsBoutons) {
			if(btn.equals(e.getSource())) {
				this.Board.remove(btn);
				this.PetitsBoutons.remove(btn);
				this.Board.repaint();
				this.Board.revalidate();
				return;
			}
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(BigButtons)) {
			GrosButton();
		}
		if(e.getSource().equals(SmallButtons)) {
			PetitButton();
		}
		RemoveSmallButtons(e);
	}

}
