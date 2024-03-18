public class App {
    public static void main(String[] args) throws Exception {
       

         MyThread th1 = new MyThread();
         MyThread th2 = new MyThread();

         th1.setName("Thraed 1");
         th2.setName("Thread 2 ");
 
         SharedResource s = new SharedResource();

         th1.sr = s;
         th2.sr = s;


         th1.start();
         th2.start();





    }
}
