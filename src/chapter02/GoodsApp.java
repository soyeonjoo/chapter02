package chapter02;

public class GoodsApp {

	public static void main(String[] args) {
		Goods camera = new Goods();
		
		camera.setName("nikon");
		camera.setPrice(4000);
		camera.setCountStock(10);
		camera.setCountSold(0);
		
	
		System.out.println(camera);
		
		int discountPrice = camera.calcDiscountPrice(50);
		System.out.println(discountPrice);
		
		
		Goods goods1 = new Goods("cannon", 200000, 0, 100);
		
		
	}

}
