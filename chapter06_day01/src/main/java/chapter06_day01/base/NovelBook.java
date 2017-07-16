package chapter06_day01.base;

public class NovelBook implements Book {

	private String bookName;

	private int bookPrice;
	private String bookAuthor;

	public NovelBook(String bookName, int bookPrice, String bookAuthor) {
		super();
		this.bookName = bookName;
		this.bookPrice = bookPrice;
		this.bookAuthor = bookAuthor;
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

}
