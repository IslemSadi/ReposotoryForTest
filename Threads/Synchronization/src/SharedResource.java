public class SharedResource {
 
int computer=0;

        public  synchronized  void Iterate(){
         
            computer++;


             System.out.println(Thread.currentThread()+" : "+computer);


         




        }





}
