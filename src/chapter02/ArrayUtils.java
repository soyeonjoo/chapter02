package chapter02;

public class ArrayUtils {
	public static double[] intToDouble(int[]arrayInt){
		if(arrayInt ==null){
			return null;
		}
		int length = arrayInt.length; // 속도 차이가 있을수 있기 때문에 미리 지정해놓고 쓰기
		double[] arrayDouble = new double[length]; // 내부에서 배열을 만들어서 리턴
		for(int i =0;i<length;i++){
			arrayDouble[i]=arrayInt[i];
		}
		return arrayDouble;
	}
	
	public static int[] doubleToInt (double[]arrayDouble) {
		int length = arrayDouble.length;
		
		int[] arrayInt = new int[length];
		
		for(int i =0;i<length;i++){
			arrayInt[i]=(int)arrayDouble[i];
		}
		
		return arrayInt;
	}
	
	public static int[] concat(int[]s1,int[]s2){
		
		int length = s1.length+s2.length;
		if(length==0){
		 return null;
		}
		
		int[] arrayConcat= new int[length];
		for(int i=0; i<s1.length;i++){
			arrayConcat[i]=s1[i];
		}
		for(int j=s1.length;j<length;j++){
			arrayConcat[j]=s2[j-5];
		}
		return arrayConcat;
	
	}

	/*public static int[] concat2(int[] arrayInt1, int[]arrayInt2){
		int length1 = arrayInt1==null?0:arrayInt1.length;
		int length2 = arrayInt2 == null ? 0 : arrayInt2.length;
		
	
	}
	*/
	
	
}
