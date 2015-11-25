import java.util.*;

public class Book implements Comparable<Book>, Cloneable{
	private String title;
	private Date publishDate;
	private String comment;
	public boolean equals(Object o){
		if(o == this) return true;
		if(o == null) return false;
		if(!(instanceof Book)) return false;
		Book b = (Book) o;
		if( (this.title.equals(b.title)) && (this.publishDate.equals(b.publishDate)) ){
			return true;
		}else{
			return false;
		}
	}
	public int hashCode(){
		int result = 37;
		result = result * 31 + this.title.hashCode();
		result = result * 31 + this.publishDate.hashCode();
		return result;
	}
	public int compareTo(Book obj){
		return this.publishDate.compareTo(obj.publishDate);
	}
	public Book clone(){
		Book result = new Book();
		result.title = this.title;
		result.publishDate = (Date) this.publishDate.clone();
		result.comment = this.comment;
		return result;
	}
}