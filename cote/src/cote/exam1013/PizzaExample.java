package cote.exam1013;
import java.util.Scanner;

public class PizzaExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		String size = sc.next();
		sc.close();
		
		Pizza pizza;
		if(name.equals("C")) {
			pizza = new CheesePizza(size);
		}
		else if(name.equals("b")) {
			pizza = new BulgogiePizza(size);
		}
		else {
			pizza = new peppernoni(size);
		}
		pizza.cook();
		pizza.serve();
	}

}
