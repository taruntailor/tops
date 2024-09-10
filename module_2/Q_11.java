/*Create a class named 'Member' having the following members:
Data members
a) Name
b) Age
c) Phone number
d) Address 5 - Salary
e) It also has a method named 'printSalary' which prints the
salary of the members.
f) Two classes 'Employee' and 'Manager' inherits the
'Member' class. The 'Employee' and 'Manager' classes
have data members 'specialization' and 'department'
respectively. Now, assign name, age, phone number,
address and salary to an employee and a manager by
making an object of both of these classes and print the
same.*/
package module_2;

class Member {
	String name;
	int age;
	String phoneNumber;
	String address;
	double salary;

	public Member(String name, int age, String phoneNumber, String address, double salary) {
		this.name = name;
		this.age = age;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.salary = salary;
	}

	public void printSalary() {
		System.out.println("Salary: " + salary);
	}
}

class Employee extends Member {
	String specialization;

	public Employee(String name, int age, String phoneNumber, String address, double salary, String specialization) {
		super(name, age, phoneNumber, address, salary);
		this.specialization = specialization;
	}
}

class Manager extends Member {
	String department;

	public Manager(String name, int age, String phoneNumber, String address, double salary, String department) {
		super(name, age, phoneNumber, address, salary);
		this.department = department;
	}

}

public class Q_11 {
	public static void main(String[] args) {
		Employee employee = new Employee("John Doe", 25, "1234567890", "123 Main St", 50000.0, "Java Developer");
		Manager manager = new Manager("Jane Smith", 30, "9876543210", "456 Park Ave", 80000.0, "HR");

		System.out.println("Employee Details:");
		System.out.println("Name: " + employee.name);
		System.out.println("Age: " + employee.age);
		System.out.println("Phone Number: " + employee.phoneNumber);
		System.out.println("Address: " + employee.address);
		employee.printSalary();
		System.out.println("Specialization: " + employee.specialization);

		System.out.println("\nManager Details:");
		System.out.println("Name: " + manager.name);
		System.out.println("Age: " + manager.age);
		System.out.println("Phone Number: " + manager.phoneNumber);
		System.out.println("Address: " + manager.address);
		manager.printSalary();
		System.out.println("Department: " + manager.department);
	}
}
