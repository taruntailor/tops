//W.A.J. P to create one thread by implementing Runnable
//interface in Class.

package module_2;


class myrun implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
 }
public class Q_29 {
	public static void main(String[] args) {
		myrun myRunnable = new myrun();
        Thread thread = new Thread(myRunnable);
thread.start();
System.out.println("thread runn............!");
	}

}
