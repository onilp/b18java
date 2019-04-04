package snake;

public class Student1 {
	int rollNo;
	String name;
	static String COLLEGE_NAME = "IIT";
	
	  static{
		  System.out.println("static block is invoked");
		  }  

	
	public static int calculateAverage(int a, int b, int c) {
		return a+b+c/3;
	}
	
	
	public Student1(int r, String n) {//sravan
		//super();
		System.out.println("constructor is invoked");
		rollNo = r;
		name = n;
	}

	public Student1(int r) {//sravan
		//super();
		rollNo = r;
		//name = n;
	}
	
	public void insertRecord(int r, String n) {
		rollNo = r;
		name = n;
		int a =10;
		int b = 20;
		int c = a+b;
			
	}
	
	public void displayRecord() {
		System.out.println("name ="+name +"\nid ="+rollNo+"\ncollege ="+COLLEGE_NAME);
	}
	
	public static void main(String[] args) {
		//Student1 s1 = new Student1();//default constructor
		//s1.insertRecord(007, "bond");
		Student1 s1 = new Student1(7, "bond"); //sravan constructor
		s1.displayRecord();
		Student1 s2 = new Student1(8,"abdul");
		s2.displayRecord();
	}

}
