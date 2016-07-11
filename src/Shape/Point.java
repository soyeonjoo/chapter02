package Shape;

public class Point implements Drawable {
	private int x;
	private int y;
	
	public Point(){
		
	}

	public Point(int x, int y){ //super ();
			this.x=x;
			this.y=y;
	}
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




	public void showPoint(){
		System.out.println("[x= " + x + ",y= " + y + "]에 점을 그렸습니다.");
	}
	public void showPoints(boolean visible){//메소드 오버로드
		if(visible){
			showPoint();//로 써도되고 System.out.println("[x= " + x + ",y= " + y + "]에 점을 그렸습니다.");로 써도됨
			return;
		}
			System.out.println("[x= " + x + ",y= " + y + "]에 점을 지웠습니다.");// if else 복잡하니깐 return을 통해 else 빼기 
	}

	@Override
	public void draw() {
		showPoint();
		
	}
	}
