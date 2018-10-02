package lib;

public class Book {
	
	private String author;
	private String title;
	private String ISBN;

	public Book()
	{
		author=null;
		title=null;
		ISBN=null;
	}
	
	public Book(String a, String t, String i) {
		author = a;
		title = t;
		ISBN = i;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getISBN() {
		return ISBN;
	}
	
	public void setAuthor(String a) {
		author=a;
	}


	public void setTitle(String title) {
		this.title = title;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	

	@Override
	public String toString() {
		return  "\nTitle=" + title + "\nAuthor=" + author + "\nISBN=" + ISBN;
	}
	
	
	
}
