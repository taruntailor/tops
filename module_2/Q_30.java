//
//W.A.J. P to create one thread by extending Thread class in
//another Class.
package module_2;

class mythread extends Thread{
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("hello.............");
	}
}
public class Q_30 {

	public static void main(String[] args) {
		mythread mythread = new mythread();
		mythread.start();
		
		System.out.println("continuse...........s");
	}
}
