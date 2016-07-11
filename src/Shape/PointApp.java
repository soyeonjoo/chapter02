package Shape;

public class PointApp {

	public static void main(String[] args) {
		Point point1 = new Point(100,200);
/*		point.setX(100);
		point.setY(200);
		
*/		//point.showPoint();
		
		Point point2 =new Point();
		point2.setX(2000);
		point2.setY(10);
	/*	point2.showPoint();
		point2.showPoints(false);
		
		*/Point point3 =new Point();
		
		draw( point1 );  
		draw( point2 );  
		draw( point3 );  
	  
		draw( new Rectangle() );  
		draw( new Triangle() );  
		draw( new Circle() );  
		draw( new Pentagon() );  

/*		drawPoint(point);
		drawPoint(point2);
		
		drawShape( new Rectangle());
		drawShape( new Triangle());
		drawShape( new Circle());*/
		
	/*	Point point3 = new ColorPoint();//가능하다
		point3.setX(50);
		point3.setY(15);
		((ColorPoint)point3).setColor("red");//캐스팅
		point3.showPoint();
	
		ColorPoint point4 = new ColorPoint();
		point4.setColor("bbbb");*/
	}
/*		public static void drawPoint (Point point){
			point.showPoint();
		}
		public static void drawShape(Shape shape){
			shape.draw();
		}
*/
		
	public static void draw(Drawable drawable){ //선언을 꼭해줘야함 
		drawable.draw();
	}
}
