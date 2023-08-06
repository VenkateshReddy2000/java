
public class ArrayOfObjects {

	public static void main(String[] args) {

		Book[] books = new Book[10];
		books[4] = new Book();

		Book myBook;
		myBook = new Book();
		//myBook =  null;

		if (myBook !=null) {

			System.out.println(myBook.getTitle());
		}
	}


}
