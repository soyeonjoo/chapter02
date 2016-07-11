package Shape;

public abstract class Shape {

	private String lineColor;
	private String fillColor;
	
	public void draw(){//도형마다 다르기 때문에 부모에서 그릴수없다. 오버라이드해서 자식에서 그리기
		System.out.println("구체적인 도형을 그릴 수 없습니다.");
	}
	
	
	public String getLineColor() {
		return lineColor;
	}

	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}

	public String getFillColor() {
		return fillColor;
	}

	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}
	
}
