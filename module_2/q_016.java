/*
 * Create an abstract class 'Bank' with an abstract method
'getBalance'. $100,
$150 and $200 are deposited in banks A, B and C respectively.
'BankA', 'BankB' and 'BankC' are subclasses of class 'Bank',
each having a method named 'getBalance'. Call this method
by creating an object of each of the threeclasses.*/
package module_2;
abstract class bank{
    abstract int getBalance();
	
}
class BankA extends bank{

	int balance=100;
	@Override
	int getBalance() {
		// TODO Auto-generated method stub
		return balance;
	}
	
}
class BankB extends bank{
	int balnce=150;

	@Override
	int getBalance() {
		// TODO Auto-generated method stub
		return balnce;
	}
	
}
class BankC extends bank {
    private int balance = 200; 

    @Override
    int getBalance() {
        return balance;
    }
}

public class q_016 {
	public static void main(String[] args) {
		 BankA bankA = new BankA();
	     BankB bankB = new BankB();
	     BankC bankC = new BankC();
	     
	     
	     System.out.println("Balance in Bank A: $" + bankA.getBalance());
	     System.out.println("Balance in Bank B: $" + bankB.getBalance());
	     System.out.println("Balance in Bank C: $" + bankC.getBalance());
	}
}
