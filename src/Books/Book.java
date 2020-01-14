package Books;


public class Book {

	private String title;
	private String author;
	private String publisher;
	private int year;
	private int isbn;
	
	
	
	public Book(String title, String author, String publisher, int year, int isbn) {
		this.title=title;
		this.author=author;
		this.publisher=publisher;
		this.year=year;
		this.isbn=isbn;
	}

	public String getPublisher() {
		return publisher;
	}


	public int getYear() {
		return year;
	}

	public int getIsbn() {
		return isbn;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}
	
	public String bookInfo() {
		return String.format("\nTitle: " + getTitle() + "\nAuthor: " + getAuthor() +
				"\nPublisher: " + getPublisher() + "\nYear: " + getYear() + "\nISBN: " + getIsbn());
		
	}
	
	

	
}
