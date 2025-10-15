package cote.exam1013;

public class BulgogiePizza extends Pizza{
	public BulgogiePizza() { this("M"); }
	public BulgogiePizza(String size) {
		this.name = "불고기피자";
		this.size = size;
		this.prices = new int[] { 15000, 20000, 30000 };
		this.toppings = "불고기";
	}
	@Override
	public void cook() {
		System.out.println(toppings + "을 추가합니다.");
		super.cook();
	}
}