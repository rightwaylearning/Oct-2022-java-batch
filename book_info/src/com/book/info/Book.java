package com.book.info;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.author.info.Author;

@Component
@Scope("singleton") 
public class Book {

	@Value("${name}")
	private String bookName;
	
	@Value("${count}")
	private Integer pageCount;
	
	@Value("${price}")
	private Double bookPrice;
	
	@Autowired
	private Author author;

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public Integer getPageCount() {
		return pageCount;
	}

	public void setPageCount(Integer pageCount) {
		this.pageCount = pageCount;
	}

	public Double getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(Double bookPrice) {
		this.bookPrice = bookPrice;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [bookName=" + bookName + ", pageCount=" + pageCount + ", bookPrice=" + bookPrice + ", author="
				+ author + "]";
	}
	
	
}
