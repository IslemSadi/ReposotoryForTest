public class App {
    public static void main(String[] args) throws Exception {

         Window w = new Window();
                  
         MyThread th1 = new MyThread();

         MyThread th2 = new MyThread();
        
         th1.label = w.label1;

         th2.label = w.label2;

         th1.start();

         th2.start();
        
         
         
    }
}
