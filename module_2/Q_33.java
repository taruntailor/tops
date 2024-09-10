//W.A.J.P to start the same Thread twice by calling start ()
//method twice. Test ThreadTwice1 t1=new
//TestThreadTwice1(); t1.start (); t1.start ();
package module_2;
class TestRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread is running.");
    }
}
public class Q_33 {
	public static void main(String[] args) {
        TestRunnable runnable = new TestRunnable(); // Runnable object
        Thread t1 = new Thread(runnable); // First Thread
        Thread t2 = new Thread(runnable); // Second Thread

        t1.start(); // Start first thread
        t2.start(); // Start second thread
    }
}
