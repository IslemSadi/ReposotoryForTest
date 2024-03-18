import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyThread extends Thread {


JLabel label;
  
    @Override
    public void run() {
        
          for(int i = 50 ; i >=  0 ; i--){
            
           label.setText(i+"");           
           
           try {
            sleep( (long) (Math.random()*3000)  );
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

         }

    } 
    
    


}
