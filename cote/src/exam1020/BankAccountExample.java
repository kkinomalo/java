package exam1020;

public class BankAccountExample {

	public static void main(String[] args) {
		BankAccount account = new BankAccount("김자바", "111-1111-2233");
		BankAccount account2 = new BankAccount("이자바", "111-1132-2123");
		
		System.out.println(BankAccount.getCount());
		int currentBalance = account.deposit(10000);
		System.out.println(currentBalance);
		System.out.println(account.getBalance());
		
		int amount = account.withdrawal(5000);
		System.out.println(amount);
		System.out.println(account.getBalance());
		
		amount = account.withdrawal(6000);
		System.out.println(amount);
		System.out.println(account.getBalance());	
	}
}
