package chapter02;

public class Goods {
	
	public static int countOfGoods; // 한개만 생성 인스턴스 변수와는 다른것. static변수
	private String name;
	private int price;
	private int countStock;
	private int countSold;
	
	public Goods(){ //생성자 , 내가 굳이 안써도 저절로 만들어주기때문에안써도됨 
		Goods.countOfGoods++;
	
	
	
	}
	
	public static int getCountOfGoods(){
		return countOfGoods;
	}
	public Goods (String name, int price, int countStock, int countSold){
		countOfGoods++;
		
		this.name=name;
		this.price=price;
		this.countStock=countStock;
		this.countSold=countSold;
	}
	
	
	
	
	
	
	
	
	
	public void setName(String name){
		this.name = name; //같으니깐 헷갈린다. this 를 써주면 앞에 name은 위에 인스턴스 변수를 가르킴
	}
	public String getName(){//source -> generate getters & setters 가면 알아서 만들수 있다
		return name;	
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {//data보호하기위한 코드 가격 -1 나오지 않기 위해
		if(price<0){
			price =0;
		}
		this.price = price;
	}
	public int getCountStock() {
		return countStock;
	}
	public void setCountStock(int countStock) {
		this.countStock = countStock;
	}
	public int getCountSold() {
		return countSold;
	}
	public void setCountSold(int countSold) {
		this.countSold = countSold;
	}
	
	public void showInfo(){ //toString  과 다르게   return 값이 없음
		System.out.println(
				"[name= " + name + "," +
				"price= " + price + ","+
				"countStock= " + countStock + "," +
				"countSold=" + countSold + "]");
		
	}
	@Override
	public String toString() {
		return "Goods [name=" + name + ", price=" + price + ", countStock=" + countStock + ", countSold=" + countSold
				+ "]";
	}
	
	
	public int calcDiscountPrice(int percentage){
		return price * percentage /100;
	}
	
}
