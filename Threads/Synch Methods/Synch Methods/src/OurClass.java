public class OurClass {


boolean isOur=true;    

  synchronized void OurMethod(){
 

        while (!isOur) {
             try {
                wait();
            } catch (InterruptedException e) {
                
                e.printStackTrace();
            }
        }
    
        System.out.print(" Ours "); 
        isOur=false;
        notify();
    }
     
   synchronized void MyMethod(){


       while (isOur) {
          try {
            wait();
        } catch (InterruptedException e) {
            
            e.printStackTrace();
        }
       }
      System.out.print(" My ");
      isOur=true;
      notify();


   }




}
