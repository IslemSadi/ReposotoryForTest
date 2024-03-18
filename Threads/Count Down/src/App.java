public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fenetre fenetre = new Fenetre();
		
		ThreadTest th1 = new ThreadTest();
		th1.label = fenetre.label1;
		
		ThreadTest th2 = new ThreadTest();
		th2.label = fenetre.label2;
				
		ThreadTest th3 = new ThreadTest();
		th3.label = fenetre.label3;
		
		th1.start();
		th2.start();
		th3.start();
	
	}

}