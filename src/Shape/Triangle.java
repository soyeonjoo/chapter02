package Shape;

public class Triangle extends Shape implements Drawable{

	@Override
	public void draw() {
		System.out.println("삼각형을 그렸습니다.");
	}
	
}
