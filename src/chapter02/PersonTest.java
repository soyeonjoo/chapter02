package chapter02;

public class PersonTest {
	public static void main(String[]args){
		Person p = new Student(10);
		
		Student s =new Student();
		Person p2 = s;
		
		Person p3 = new Student();
		
		((Student)p3).showInfo();
	}
}
