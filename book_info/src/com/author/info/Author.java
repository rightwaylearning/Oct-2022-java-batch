package com.author.info;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class Author {

	@Value("${author_name}")
	private String authorName;
	
	@Value("${book_published}")
	private Integer bookPublished;

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public Integer getBookPublished() {
		return bookPublished;
	}

	public void setBookPublished(Integer bookPublished) {
		this.bookPublished = bookPublished;
	}

	@Override
	public String toString() {
		return "Author [authorName=" + authorName + ", bookPublished=" + bookPublished + "]";
	}
	
}
