public class App {
    public static void main(String[] args) throws Exception {
       // new State
           MyThread threadstring = new MyThread();
           OurThread threaddouble = new OurThread();
       
                 System.out.println(threadstring.getState());
                 System.out.println(threaddouble.getState()); 
       //Runnable State
           threadstring.start();
           threaddouble.start();

           System.out.println(threadstring.getState());
           System.out.println(threaddouble.getState());

            // the System.out.println("") method is a synchronized method therefore when one of the threads try to acces it 
            // the other one is blocked until the other is done printing it that is why its state is BLOCKED


          threadstring.join();  // threadString will wait for the other thread to die before it proceeds
        
         //Terminated State 
         
           System.out.println(threadstring.getState());
           System.out.println(threaddouble.getState());

    }
}
