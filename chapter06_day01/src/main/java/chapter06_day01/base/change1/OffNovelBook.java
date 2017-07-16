package chapter06_day01.base.change1;

import chapter06_day01.base.NovelBook;

public class OffNovelBook extends NovelBook {

	public OffNovelBook(String bookName, int bookPrice, String bookAuthor) {
		super(bookName, bookPrice, bookAuthor);
	}

	@Override
	public int getBookPrice() {
		int originPrice = super.getBookPrice();
		int currentPrice = 0;
		if (originPrice > 4000) {
			currentPrice = originPrice * 90 / 100;
		} else {
			currentPrice = originPrice * 80 / 100;
		}
		return currentPrice;
	}

}
