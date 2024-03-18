import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
public class Window extends JFrame {

JLabel label1;
JLabel label2;

    Window(){

       setVisible(true);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setSize(720,720);
       setLayout(new FlowLayout());
       setTitle("Countdown"); 
       Font font = new Font("Segoe UI", Font.BOLD, 50);


       label1 = new JLabel("Test");
       label2 = new JLabel("Test");

       label1.setFont(font);
       label2.setFont(font);

       add(label1);
       add(label2);


    }




    
}
