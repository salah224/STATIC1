package static1;
//http://www.javatpoint.com/static-keyword-in-java

class student{
	int age;
	String name;
	static String college = "NAIC";
	student(int r, String n){
		age = r;
		name = n;
		
	}
	void display(){
		System.out.println(age + " " +name +" " +  college);
	}
}
public class static1 {
	public static void main(String[] args) {
		student s1 = new student(222, "karla");
		student s2 = new student(222, "aryan");
		s1.display();
		s2.display();
		
	}

}
