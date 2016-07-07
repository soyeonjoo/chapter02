package chapter02;

public class Swap {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = add(a,b);
		
	/*	System.out.println(a +" ,"+b);
		swqp(a,b);
		System.out.println(a + " , "+ b);
	*/
		Value v1 = new Value();
		v1.setVal(10);
		
		Value v2 = new Value();
		v2.setVal(20);
		
		System.out.println(v1.getVal()+","+v1.getVal());
		swap(v1,v2);
		System.out.println(v2.getVal()+","+v2.getVal());
		
	}
	
	public static void swap(Value val1, Value val2){
		int temp = val1.getVal();
		val1.setVal(val2.getVal());
		val2.setVal(temp);
	}
	public static int add(int i, int j){
		int result = i+j;
		return result;
	}
	public static void swqp ( int i, int j){
		int temp;
		temp=i;
		i=j;
		j=temp;
	}
}
