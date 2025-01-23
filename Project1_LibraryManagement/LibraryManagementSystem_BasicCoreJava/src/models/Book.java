package models;

public class Book {
	private int sl_no;
	private String bookName;
	private String bookDescription;
	private String author;
	private Boolean isIssued;
	
	//Constructors
	public Book(int sl_no, String bookName, String bookDescription, String author) {
		super();
		this.sl_no = sl_no;
		this.bookName = bookName;
		this.bookDescription = bookDescription;
		this.author = author;
	}
	
	//Getters and Setters
	public int getSl_no() {
		return sl_no;
	}
	public void setSl_no(int sl_no) {
		this.sl_no = sl_no;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookDescription() {
		return bookDescription;
	}
	public void setBookDescription(String bookDescription) {
		this.bookDescription = bookDescription;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}

	public Boolean isIssued() {
		return isIssued;
	}

	public void setIsIssued(Boolean issued) {
		isIssued = issued;
	}

	//ToString()
	@Override
	public String toString() {
		return "Books [sl_no=" + sl_no + ", bookName=" + bookName + ", bookDescription=" + bookDescription + ", author="
				+ author + "]";
	}
	
	
	
	
	

}
