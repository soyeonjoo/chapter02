package Shape;

public class Point {
	public int getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
	}


	public int getY() {
		return y;
	}


	public void setY(int y) {
		this.y = y;
	}


	private int x;
	private int y;
	
	
	public void showPoint(){
		System.out.println("[x= " + x + ",y= " + y + "]에 점을 그렸습니다.");
		
	}
}
