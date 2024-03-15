import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.FlowLayout;
public class Window extends JFrame {

int nButtons;


     Window(){
       
       setVisible(true);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setSize(500, 400);
       setTitle("Buttons");
       setLayout(new FlowLayout());  

      while (true) {
        
      try{

      nButtons =  Integer.parseInt(JOptionPane.showInputDialog(this, "Enter the number of the buttons"));
      break;
      }catch(Exception exception){

       JOptionPane.showMessageDialog(this, exception.getMessage());  

      }
      
      }

      
     
        for(int i=1;i<=nButtons;i++){

           add(new JButton("Button"+i));
           
        }          
        revalidate();
        repaint();
     }



}
