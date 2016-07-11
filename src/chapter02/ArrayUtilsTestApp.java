package chapter02;

public class ArrayUtilsTestApp {

	public static void main(String[] args) {
		int[] arrayInt1 = {10, 20, 30 , 40, 50};
		int[] arrayInt2 = {60, 70, 80, 90, 100};
		double[] arrayDouble1 = {123.4, 567.8, 910.1, 12.6};
		
		
		
		double[] arrayDouble = ArrayUtils.intToDouble(arrayInt1);
		for(double d : arrayDouble){
			System.out.print(d+ " ");
		}	System.out.println();
		
		
		int[] arrayInt = ArrayUtils.doubleToInt(arrayDouble1);
		for(int i : arrayInt){
			System.out.print(i+ " ");
		}	System.out.println();
		
		
		int[] arrayConcat = ArrayUtils.concat(arrayInt1,arrayInt2);
		for(int concatresult : arrayConcat){
			System.out.print(concatresult+" ");
		}System.out.println();

	}
}


