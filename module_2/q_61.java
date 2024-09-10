//W.A.J.P to create 2 threads and make one thread as
//Daemon Thread by using set Daemon () method of Thread
//class and check whether the threadis set daemon or not
//by using is Daemon () method.

package module_2;
class MyThad extends Thread {
    public MyThad(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is running.");

        // Simulate some work
        try {
            Thread.sleep(2000); // Sleep for 2 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(Thread.currentThread().getName() + " completes.");
    }
}
public class q_61 {
public static void main(String[] args) {
	 Thread thread1 = new MyThad("Thread 1");
     Thread thread2 = new MyThad("Thread 2");
    // Set thread2 as daemon thread
    thread2.setDaemon(true);

    // Start both threads
    thread1.start();
    thread2.start();

    // Check if thread1 is daemon
    System.out.println(thread1.getName() + " isDaemon: " + thread1.isDaemon());
     
    // Check if thread2 is daemon
    System.out.println(thread2.getName() + " isDaemon: " + thread2.isDaemon());

    // Main thread continues
    System.out.println("Main thread completes.");
}
}
