package chapter02;

public class GoodsApp {

	public static void main(String[] args) {
		
		
		System.out.println(Goods.getCountOfGoods());//아직 객체를 만들지 않아서 0이나옴
		Goods camera = new Goods();
		
		camera.setName("nikon");
		camera.setPrice(4000);
		camera.setCountStock(10);
		camera.setCountSold(0);
		
	
		System.out.println(camera);
		
		int discountPrice = camera.calcDiscountPrice(50);
		System.out.println(discountPrice);
		
		
		Goods goods1 = new Goods("cannon", 200000, 0, 100);
		
		System.out.println(Goods.countOfGoods);
	}

}
