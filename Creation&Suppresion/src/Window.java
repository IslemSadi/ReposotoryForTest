import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;

public class Window extends JFrame implements ActionListener{

JButton creationButton = new JButton("create Button");
JButton suppresionButton = new JButton("delete Button");

JPanel buttonCanvas = new JPanel(new FlowLayout());

private static int numButtons = 0 ;
private static int numButtonsmax;

ArrayList<JButton> buttons;

      Window(int numButtonsmax){
        Window.numButtonsmax = numButtonsmax;
      this.setVisible(true);
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLayout(new BorderLayout());
      setSize(720, 720);
      buttons = new ArrayList<>();
      this.add(creationButton,BorderLayout.NORTH);
      this.add(suppresionButton,BorderLayout.SOUTH);

      buttonCanvas.setBackground(Color.GRAY);

      this.add(buttonCanvas,BorderLayout.CENTER); 


      creationButton.addActionListener(this);
      suppresionButton.addActionListener(this);

      }   

private boolean addButton(){


  if(buttons.size() <= numButtonsmax ){
    JButton b = new JButton("Button"+numButtons); 
       numButtons++;
       b.addActionListener(this); // this will add an action listner to the newly created button
       buttonCanvas.add(b);
       buttons.add(b);
       this.revalidate();
       this.buttonCanvas.repaint();
       this.buttonCanvas.revalidate();
       this.repaint();
     return true;
      
    }else{
        this.revalidate();
        this.buttonCanvas.repaint();
        this.buttonCanvas.revalidate();
        this.repaint();
       return false;

    }
}
private boolean removeButton(){

      for(JButton button:buttons){

           if(button.getBackground() == Color.RED){

             buttons.remove(button);
             buttonCanvas.remove(button);  
             
             
             
             } else{

             return false;
           }


      }   
        this.buttonCanvas.repaint();
        this.repaint();
  return true;


}

private boolean removeRedButton(){

   ArrayList<JButton> rempButtons = new ArrayList<>();

   for(JButton button : buttons){
      if(button.getBackground() == Color.RED){

         rempButtons.add(button);       
 

      }
   }
   for(JButton button : rempButtons){
         
      buttons.remove(button);
      buttonCanvas.remove(button); 
   }

        this.revalidate();
        this.buttonCanvas.repaint();
        this.buttonCanvas.revalidate();
        this.repaint();

   return true; 

}


@Override
public void actionPerformed(ActionEvent e) {
   
// if the action performed was not by the CreateButton or DeleteButton , then this means that it was perfomed by what's inside the
// canvas
    if (e.getSource().equals(creationButton)) {
        
   
     addButton();


    }else
  
    if (e.getSource().equals(suppresionButton)) {
        
   
      removeRedButton();

    }else{
 
  for(JButton button : buttons){
    if(e.getSource().equals(button) && button.getBackground() != Color.RED){

       button.setBackground(Color.RED);
       break; 

    }
    if (e.getSource().equals(button) && button.getBackground() == Color.RED) {
         
         button.setBackground(suppresionButton.getBackground());
         break;
    }
          }
  }



}













}
