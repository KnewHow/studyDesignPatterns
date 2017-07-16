package chapter06_day01.base.change2;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

import chapter06_day01.base.Book;
import chapter06_day01.base.change1.OffNovelBook;

public class BookStore {
	/**
	 * High level modules should depend on abstractions
	 */
	public static final List<Book> bookList = new ArrayList<>();
	static {
		bookList.add(new OffNovelBook("天龙八部", 3200, "金庸"));
		bookList.add(new OffNovelBook("巴黎圣母院", 5600, "雨果"));
		bookList.add(new OffNovelBook("悲惨世界", 3500, "雨果"));
		bookList.add(new OffNovelBook("金瓶梅", 4300, "兰陵笑笑生"));
		bookList.add(new ComputerBook("Think in JAVA", 10000, "Bruce Eckel","编程思想"));
	}

	public static void main(String[] args) {
		NumberFormat format = NumberFormat.getCurrencyInstance();
		format.setMaximumFractionDigits(2);
		System.out.println("-----------书店卖出的书记录如下-------------");
		for (Book book : bookList) {
			System.out.println("书籍名称： " + book.getBookName() + "\t" + "书籍作者：" + book.getBookAuthor() + "\t" + ""
					+ "书籍价格： " + format.format(book.getBookPrice() / 100.0) + "\t");
		}
	}
}
