

public class Book {
	private String title;
	private String author;
	private  String publishdate;
	private  String content;
	private int price;
	private String status;

	
private int isbn ;
public int getIsbn() {
	return isbn;
}
public void setIsbn(int isbn) {
	this.isbn = isbn;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public String getPublishdate() {
	return publishdate;
}
public void setPublishdate(String publishdate) {
	this.publishdate = publishdate;
}
public String getContent() {
	return content;
}
public void setContent(String content) {
	this.content = content;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
@Override
public String toString() {
	return "Book [title=" + title + ", author=" + author + ", publishdate=" + publishdate + ", content=" + content
			+ ", price=" + price + ", status=" + status + ", isbn=" + isbn + "]";
}


}
