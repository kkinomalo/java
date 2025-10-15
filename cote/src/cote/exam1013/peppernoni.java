package cote.exam1013;

public class peppernoni extends Pizza{
	public peppernoni() { this("M"); }
	public peppernoni(String size) {
		this.name = "페퍼로니피자";
		this.size = size;
		this.prices = new int[] { 12000, 18000, 27000 };
		this.toppings = "pepperoni";
	}
	@Override
	public void cook() {
		System.out.println(toppings + "을 추가합니다.");
		super.cook();
	}
}