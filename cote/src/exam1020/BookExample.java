package exam1020;

public class BookExample {

	public static void main(String[] args) {
		Book[] books = new Book[3];
		books[0] = new Book("자바", "김자바", "123-4567-8910");
		books[1] = new Book("파이썬", "이파이", "123-4567-9983", 30000);
		books[2] = new Book("디비", "박데이터", "123-4567-9912");
		
		for(Book book : books) {
			System.out.println(book.getTitle());
		}
	}

}
