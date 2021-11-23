
public class PRNParser implements PRNParser_Interfaces{
	private Book LastBookBuffer;
	
	public PRNParser() {
		LastBookBuffer=null;
	}

	
	public Book GetLastRead() {
		return LastBookBuffer;
	}

	
	
	public ParseStatus Parseline(Book currentBook) {
		this.LastBookBuffer=currentBook;
		try {
			
			if(currentBook.GetBookId()==null || currentBook.GetBookAuthor()==(null) || currentBook.GetBookName()==(null))
				return ParseStatus.Incomplete;
			
			
			for(char digit:currentBook.GetBookId()) {
				if(digit<'0' || digit>'9')
					throw new NotAnIdNumException("id is Incorrect", null);
			}
			
			return ParseStatus.Done;
		}
		
		catch(NotAnIdNumException e){
			System.out.println("Book Id is incorrect, please make sure the id digits are legal");
			return ParseStatus.Error;
		}
		
		
	}
	
	
}
