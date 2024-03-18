public class OurThread  extends Thread{

 OurClass class1;

   @Override
   public void run() {
       

    for(int i = 0 ; i < 10 ; i++){

        class1.OurMethod();

    }
   }
    
}
