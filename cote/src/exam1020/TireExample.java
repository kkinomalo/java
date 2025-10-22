package exam1020;

public class TireExample {

	public static void main(String[] args) {
		Tire normalTire = new Tire("일반타이어", 10000);
		WideTire wideTire = new WideTire("광폭타이어", 10000, 220);
		ColorTire colorTire = new ColorTire("컬러타이어", 10000, "빨강");

		System.out.println("=== 일반 타이어 ===");
		System.out.println("모델명: " + normalTire.getModel());
		System.out.println("회전 1: " + normalTire.roll());
		System.out.println("회전 2: " + normalTire.roll());
		System.out.println("회전 3: " + normalTire.roll());
		System.out.println("회전 4: " + normalTire.roll()); // 최대 회전수 초과

		System.out.println("\n=== 광폭 타이어 ===");
		System.out.println("모델명: " + wideTire.getModel());
		System.out.println("너비: " + wideTire.getWidth());
		System.out.println("회전 1: " + wideTire.roll());
		System.out.println("회전 2: " + wideTire.roll());
		System.out.println("회전 3: " + wideTire.roll());
		System.out.println("회전 4: " + wideTire.roll());
		System.out.println("회전 5: " + wideTire.roll()); // 최대 회전수 초과

		System.out.println("\n=== 컬러 타이어 ===");
		System.out.println("모델명: " + colorTire.getModel());
		System.out.println("색상: " + colorTire.getColor());
		System.out.println("회전 1: " + colorTire.roll());
		System.out.println("회전 2: " + colorTire.roll());
		System.out.println("회전 3: " + colorTire.roll()); // 최대 회전수 초과
	}
}