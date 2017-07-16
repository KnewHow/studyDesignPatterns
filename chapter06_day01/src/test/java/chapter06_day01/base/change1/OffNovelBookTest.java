package chapter06_day01.base.change1;

import org.junit.Test;

import chapter06_day01.base.Book;
import junit.framework.TestCase;

public class OffNovelBookTest extends TestCase {

	private String name = "平凡的世界";
	private int price = 6000;
	private String author = "路遥";
	private Book book = new OffNovelBook(name, price, author);

	@Test
	public void testGetPrice() {
		super.assertEquals(this.price*90/100, book.getBookPrice());
	}

}
