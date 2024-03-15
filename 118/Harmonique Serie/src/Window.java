import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;;
public class Window extends JFrame implements ActionListener {

JButton increaseButton=new JButton();
JButton decreaseButton=new JButton();
JLabel  nVal=new JLabel();
JLabel  N = new JLabel("N = ");
JLabel  serie=new JLabel();
JLabel Harmonique = new JLabel("Serie Harmonique =");


int n=0;
JPanel resultJPanel=new JPanel();


    Window(){


      setVisible(true);
      setSize(720,720);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setTitle("Harmonique Serie");
      setLayout(new BorderLayout());
      
      increaseButton.setText("N++");
      decreaseButton.setText("N--"); 
      increaseButton.addActionListener(this);
      decreaseButton.addActionListener(this);
      nVal.setText(String.valueOf(n));
      serie.setText("0");
      resultJPanel.setLayout(null);
      add(increaseButton,BorderLayout.NORTH);
      add(decreaseButton,BorderLayout.SOUTH);

      N.setBounds(300,0,100,100);
      nVal.setBounds(322,0,100,100);
      Harmonique.setBounds(205,10,200,100);
      serie.setBounds(322,10,200,100);

      resultJPanel.add(N);
      resultJPanel.add(nVal);
      resultJPanel.add(Harmonique);
      resultJPanel.add(serie);
        
    
      resultJPanel.revalidate();
      resultJPanel.repaint();
      

      add(resultJPanel,BorderLayout.CENTER);

       

    }

   private double calcSerie(int order){
         
    double res=1;     
        if(order==0){
        
          return Double.NaN;

        }else
        if(order==1){

        return 1;

        }
        
        else{

           for(int i=2;i<=order;i++){
            
            res +=  1.0/i ;

           }
         return res;
           
        } 

   } 

    @Override
    public void actionPerformed(ActionEvent e) {
        
      if(e.getSource().equals(increaseButton)){

       n++;
       nVal.setText(String.valueOf(n));
       serie.setText(String.valueOf(calcSerie(n)));
       
        


      }    
        
      if(e.getSource().equals(decreaseButton) && n > 0){
      
      
        
      
       n--;
       nVal.setText(String.valueOf(n));
       serie.setText(String.valueOf(calcSerie(n)));


      


      }




        
    }




}
