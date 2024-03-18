public class MyThread extends Thread {

SharedResource sr ;

    @Override
    public void run() {
      while (sr.computer<10) {
    
            sr.Iterate();
            
      }
    }








}
