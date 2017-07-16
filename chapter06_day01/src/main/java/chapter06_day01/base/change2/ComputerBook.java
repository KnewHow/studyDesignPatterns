package chapter06_day01.base.change2;

import chapter06_day01.base.Book;

public class ComputerBook implements Book {

	private String bookName;

	private int bookPrice;
	private String bookAuthor;

	private String scope;

	public ComputerBook(String bookName, int bookPrice, String bookAuthor, String scope) {
		super();
		this.bookName = bookName;
		this.bookPrice = bookPrice;
		this.bookAuthor = bookAuthor;
		this.scope = scope;
	}

	@Override
	public String getBookName() {
		return this.bookName;
	}

	@Override
	public int getBookPrice() {
		return this.bookPrice;
	}

	@Override
	public String getBookAuthor() {
		return this.bookAuthor;
	}

	public String getScope() {
		return this.scope;
	}

}
