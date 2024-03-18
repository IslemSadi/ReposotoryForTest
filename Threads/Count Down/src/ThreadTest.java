
import javax.swing.JLabel;

public class ThreadTest extends Thread {

	JLabel label;

	public void run() {

		for (int i = 10; i >= 0; i--) {
			label.setText(String.valueOf(i));
			try {
				int t = (int) (Math.random() * 2000);
				sleep(t);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

        }

    }

}