package StaticMethod;

public class Student {
	int rollNo;
	String Name;
	static String college = "AUDI";
	//static method will be changed with static variable.
	static void change() {
		college = "NAE";
	}
	Student(int r, String n){//constructor to initilize the variables.
		rollNo = r;
		Name = n;
		
	}
	//method to display the values/
	void Display() {
		System.out.println(rollNo+""+Name+""+college);
	}
	

}
