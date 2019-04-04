package basics;

public class Student {
	int rollNo;
	String name;
	
	public Student(int r, String n) {
		rollNo = r;
		name = n;
	}
	public void insertRecord(int r, String n)
	{
		rollNo = r;
		name = n;
		int a = 10;
		int b = 20;
		int c = a+b;
		
	}
	public void displayRecord()
	{
		System.out.println("name = " + name + "\nid = "+ rollNo);
	}
	public static void main(String[] args) {
		/**Student s1 = new Student(); //default constructor
		s1.insertRecord(007, "bond");
		s1.displayRecord();**/
		Student s1 = new Student(9,"Jr");
		s1.displayRecord();
	}
		
	
}
