import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Window extends JFrame implements ActionListener
{

  ArrayList<JButton> bigButtons = new ArrayList<>();
  ArrayList<JButton> smallButtons = new ArrayList<>();
  JButton createBigButton = new JButton("Create Big Button");
  JButton createSmallButton = new JButton("Create Small Button");
  JPanel buttonCanvas = new JPanel(new FlowLayout());
  int numClicksBigButtons=0;
    Window(){

     setVisible(true);
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
     setSize(720,720); 
     setTitle("Small and Big Buttons");
     this.setLayout(new BorderLayout());

     createBigButton.addActionListener(this);
     createSmallButton.addActionListener(this);

      add(createBigButton,BorderLayout.NORTH);
      add(createSmallButton,BorderLayout.SOUTH);
      add(buttonCanvas,BorderLayout.CENTER);  
      
      




    }

    @Override
    public void actionPerformed(ActionEvent e) {
     
        if(e.getSource().equals(createBigButton)){
            
           if (bigButtons.size() >=5) {

           for(JButton button : bigButtons){

            buttonCanvas.remove(button);


           }

            bigButtons = new ArrayList<>();
            revalidate();
            repaint();
            return;
           }

         JButton button = new JButton()  ;
         bigButtons.add(button);
         button.setText("Button"+bigButtons.size()); 
         button.setPreferredSize(new Dimension(100,80));// this is how we can adjust the size of a component inside a FlowLayout container
         button.addActionListener(this); 
          buttonCanvas.add(button);
           revalidate();
           repaint();

        }else if(e.getSource().equals(createSmallButton)){
           
            JButton button = new JButton()  ;
            smallButtons.add(button);
            button.setText("Small Button"); 
            button.addActionListener(this);
          buttonCanvas.add(button);
            
          revalidate();
          repaint();

        }else{

        for(JButton button : bigButtons){
          
         if(e.getSource().equals(button)){

          numClicksBigButtons++;
            JOptionPane.showMessageDialog(this, "Number of times you clicked on a big button"+numClicksBigButtons);
         }
        }  

        
        //test  

        ArrayList<JButton> remp = new ArrayList<>();
        for(JButton button : smallButtons){

          remp.add(button);


        } 




        //test
        
        for(JButton button : remp){  // by creating a remp list we can resolve the concurrentModifactionException

          if(e.getSource().equals(button)){

           buttonCanvas.remove(button); 
            repaint();
            revalidate();
           ArrayList<JButton> rempButtons = new ArrayList<>();



            for(JButton button2 : smallButtons){
               if(button2 == button){
                rempButtons.add(button2);
               }

            }



            for(JButton button2 : rempButtons){

              smallButtons.remove(button2);    
             

            }
            



          }



        }  


          return;

        }





        }





    }








