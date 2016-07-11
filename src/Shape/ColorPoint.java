package Shape;

public class ColorPoint extends Point {
	private String color;

	
	public ColorPoint(int x, int y, String color){
		super(x,y); // 명시해 주고 싶을때 setX, setY 대신 써주는것
		/*setX(x);
		setY(y);
		*/
		this.color=color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
	}

	@Override
	public void showPoint() {
		// TODO Auto-generated method stub
		 System.out.println("[x= " + getX() + ",y= " + getY() + ",color= " + color +"]에 점을 그렸습니다.");//x y 값이 private이기 때문에 getX, getY로 써야한다

	}
	
}
