import java.util.Arrays;

public class Book {
	private char[] BookName;
	private char[] Author;
	private char[] Id;
	
	public Book(char []CurrentBookName , char []CurrentAuthor , char []CurrentId) {
		this.BookName=new char[40];
		this.BookName=CurrentBookName;
		
		this.Author=new char[30];
		this.Author=CurrentAuthor;
		
		this.Id=new char[13];
		this.Id=CurrentId;
	}
	
	
	public char[] GetBookName() {
		return this.BookName;
	}
	
	public char[] GetBookAuthor() {
		return this.Author;
	}
	
	public char[] GetBookId() {
		return this.Id;
	}
	
	public void SetBookName(char [] CurrentBookName) {
		this.BookName=CurrentBookName;
	}
	
	public void SetBookAuthor(char [] CurrentBookAuthor) {
		this.Author=CurrentBookAuthor;
	}

	public void SetBookId(char [] CurrentBookId) {
		this.Id=CurrentBookId;
	}
	
	public void ToString() {
		System.out.print(Arrays.copyOfRange(this.BookName,0,40));
		if(this.Author.length>=41)
			System.out.println(Arrays.copyOfRange(this.BookName,41,this.BookName.length));
			System.out.print(this.Author+"        "+this.Id);
		
	}
}
