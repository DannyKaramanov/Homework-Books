package Books;
import java.util.ArrayList;



public class Library {

	
	String booksearch;
	String bookInfo;
	ArrayList<Book> library = new ArrayList<Book>();
	
	
	
	public void addBook(String title, String author, String publisher, int year, int isbn) {
		Book book = new Book(title, author, publisher, year, isbn);
		library.add(book);
		
        System.out.println("Enter title: " + title + "/nEnter Author " + author + "/nEnter Publisher: " + publisher + 
        		"/nEnter year: " + year + "/nEnter ISBN: " + isbn );
        
}
	
	public void removeBook(String title, String author, String publisher, int year, int isbn) {
		Book book = new Book(title, author, publisher, year, isbn);
		library.remove(book);
	}
	
	public Book searchBooks() {
		System.out.println("Which book are you looking for? ");
		
		for(Book book: library) {
			if (book.getTitle().contains(booksearch) || book.getAuthor().contains(booksearch)) {
				return book;
			}
		}
		return null; 
			
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		

	}
}
