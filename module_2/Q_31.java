//W.A.J.P to create 2 threads and execute that threads by
//providing sleep time as 2000ms and check the execution.
package module_2;
class providing  implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		try {
			System.out.println(Thread.currentThread().getName()+"is going");
			Thread.sleep(100);
		}
		catch (Exception e) {
			// TODO: handle exception
            e.printStackTrace();

		}
		
	}
	
}
public class Q_31 {
public static void main(String[] args) {
	providing myRunnable1 = new providing();
    Thread thread1 = new Thread(myRunnable1);
    thread1.start();
    providing myRunnable2 = new providing();
    Thread thread2 = new Thread(myRunnable2);
    thread2.start();

}
}
