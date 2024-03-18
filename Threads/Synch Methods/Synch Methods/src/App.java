public class App {
    public static void main(String[] args) throws Exception {
        
         OurClass c =new OurClass();

         MyThread th1 = new MyThread();

         OurThread th2 = new OurThread();

         th1.class1=c;
         th2.class1=c;


         th1.start();

         th2.start();



    }
}
