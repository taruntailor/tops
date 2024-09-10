//• W.A.J.P to set the user defined name, priority and get that
//name and priority for 2 threads using setName (),
//setPriority (), getName (), getPriority () methods of
//Thread class.
//o TestMultiPriority1 m1=new TestMultiPriority1 ();
//TestMultiPriority1 m2=new TestMultiPriority1 ();
//m1.setName(“mythread-1”); m2.setName
//(“mythread- 2”); m1.setPriority
//(Thread.MIN_PRIORITY); m2.setPriority
//(Thread.MAX_PRIORITY); o
//m1.start (); m2.start ();
package module_2;
class TestMultiPriority1 extends Thread{
	 public void run() {
	        System.out.println("Thread " + getName() + " is running.");
	    }
}
public class Q_34 {
public static void main(String[] args) {
	  TestMultiPriority1 m1 = new TestMultiPriority1();
      TestMultiPriority1 m2 = new TestMultiPriority1();
      m1.setName("mythread-1");
      m2.setName("mythread-2");

      m1.setPriority(Thread.MIN_PRIORITY);
      m2.setPriority(Thread.MAX_PRIORITY);

      m1.start();
      m2.start();
      System.out.println("Thread name: " + m1.getName() + ", Priority: " + m1.getPriority());
      System.out.println("Thread name: " + m2.getName() + ", Priority: " + m2.getPriority());
}
}
