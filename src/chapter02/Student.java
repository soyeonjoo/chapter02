package chapter02;

public class Student extends Person {
    public void set() {
       age = 30;
    //   name = "홍길ㄷㅇ";
       height = 175;
       weight = 68;	

}
    public Student(){
    	System.out.println("Student()..called");
    }
    public Student(int i){
    	System.out.println("Student(int)..called");
    }
    
    public void showInfo(){
    	System.out.println(age); // int age ->부모의 default 접근 o
    	//System.out.println(name);// private String name -> 부모의 private접근 x
    	System.out.println(height);//public int height -> 부모의 public 접근 o
    	System.out.println(weight);//protected int weight ->부모의 protected 접근 o(자식만가능)
    }
}