//W.A.J.P to create a class Student with attributes roll no, name, age
//and
//course. Initialize values through parameterized
//constructor. If age of student is not in between 15 and 21
//then generate user defined exception
//"AgeNotWithinRangeException". If name contains
//numbers or special symbols raise exception
//"NameNotValidException". Define the two exception
//classes.

package module_2;
class AgeNotWithinRangeException extends Exception {
    public AgeNotWithinRangeException(String message) {
        super(message);
    }
}

// Custom exception for invalid name
class NameNotValidException extends Exception {
    public NameNotValidException(String message) {
        super(message);
    }
}

class Student {
    private int rollNo;
    private String name;
    private int age;
    private String course;

    public Student(int rollNo, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException {
        if (age < 15 || age > 21) {
            throw new AgeNotWithinRangeException("Age not within range (15-21)");
        }
        if (!name.matches("[a-zA-Z]+")) {
            throw new NameNotValidException("Name not valid (should contain only alphabets)");
        }
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", course='" + course + '\'' +
                '}';
    }
}

public class Q_028 {
	 public static void main(String[] args) {
	        try {
	            Student student1 = new Student(1, "JohnDoe", 20, "Computer Science");
	            System.out.println(student1);
	        } catch (AgeNotWithinRangeException | NameNotValidException e) {
	            System.out.println(e.getMessage());
	        }

	        try {
	            Student student2 = new Student(2, "John123", 22, "Mathematics");
	            System.out.println(student2);
	        } catch (AgeNotWithinRangeException | NameNotValidException e) {
	            System.out.println(e.getMessage());
	        }

	        try {
	            Student student3 = new Student(3, "Jane@", 19, "Physics");
	            System.out.println(student3);
	        } catch (AgeNotWithinRangeException | NameNotValidException e) {
	            System.out.println(e.getMessage());
	        }
	    }
}
