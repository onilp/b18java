package snake;

public class Student1 {
	int rollNo;
	String name;
	static String COLLEGE_NAME = "IIT"; //static variable
	
	  static{ //static block
		  System.out.println("static block is invoked");
		  }  
	public Student1()
	{
		System.out.println("Hello this is default constructor");
	}

	
	public static int calculateAverage(int a, int b, int c) {
		return a+b+c/3;
	}
	
	
	public Student1(int rollNo, String name) {//sravan
		//super();
		this();
		System.out.println("constructor is invoked");
		this.rollNo = rollNo;
		this.name = name;
	}

	public Student1(int r) {//binsun
		//super();
		this.rollNo = r;
		//name = name;
	}
	
	public void insertRecord(int r, String n) {
		rollNo = r;
		name = n;
		int a =10;
		int b = 20;
		int c = a+b;
			
	}
	
	public void displayRecord(Student1 obj) {
		System.out.println("name ="+name +"\nid ="+rollNo+"\ncollege ="+COLLEGE_NAME);
	}
	
	public static void main(String[] args) {
		//Student1 s1 = new Student1();//default constructor
		//s1.insertRecord(007, "bond");
		Student1 s1 = new Student1(7, "bond"); //sravan constructor
		//s1.displayRecord();
		Student1 s2 = new Student1(8,"abdul");
		//s2.displayRecord();
		//displayRecord(this)
		
	}

}
