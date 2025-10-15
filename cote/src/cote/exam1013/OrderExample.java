package cote.exam1013;

import java.util.Scanner;

public class OrderExample {

	public static void main(String[] args) {
		Menu[] menus = new Menu[3];
		Menu kapuchino = new Menu("카푸치노", 4000);
		Menu bluelemonade = new Menu("블루레몬에이드", 3000);
		Menu strawberrylatte = new Menu("딸기라뗴", 6000);
		
		Scanner scanner = new Scanner(System.in);
		
		int orderIndex = scanner.nextInt();
		int quantity = scanner.nextInt();
		
		if(orderIndex >= 0 && orderIndex < menus.length && quantity > 0) {
				OrderItem item = new OrderItem(menus[orderIndex], 3);
				System.out.println(item.getPrice());
		}
	
	}

}
