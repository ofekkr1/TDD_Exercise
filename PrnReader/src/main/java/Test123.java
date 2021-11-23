import org.junit.jupiter.api.*;

public class Test123 {

    //testing extreme cases for method ParseLine 
    @Test
    //checking function behavior, in case which book data is valid
    void ParseLine_ReadValidBookData_ReturnDoneAtTheEnd()
    {
    	char []Bookname= {'o','f','e','k'};
    	char []Authorname= {'o','f','e','k'};
    	char []Id= {'5' , '1' , '0'};
    	Book book=new Book(Bookname,Authorname,Id);
    	PRNParser prn=new PRNParser();
        System.out.println("======TEST ONE EXECUTED=======");
        Assertions.assertEquals(ParseStatus.Done ,prn.Parseline(book));
    }
    
    
    
     @Test
     //checking function behavior, in case which book data is incomplete
    void ParseLine_ReadIncompleteBookData_ReturnIncompleteAtTheEnd()
    {
    	char []Bookname= {'o','f','e','k'};
    	char []Authorname= {'o','f','e','k'};
    	char []Id= new char[13];
    	Id=null;
    	Book book=new Book(Bookname,Authorname,Id);
    	PRNParser prn=new PRNParser();
        Assertions.assertEquals(ParseStatus.Incomplete ,prn.Parseline(book));
    }
    
    
    
     @Test
     //checking function behavior, in case which book data is illegal
    void ParseLine_ReadIllegalBookId_ReturnErrorAtTheEnd()
    {
    	char []Bookname= {'o','f','e','k'};
    	char []Authorname= {'o','f','e','k'};
    	char []Id= {';'};
    	Book book=new Book(Bookname,Authorname,Id);
    	PRNParser prn=new PRNParser();
        Assertions.assertEquals(ParseStatus.Error ,prn.Parseline(book));
    }
     
     
     
    
  //testing extreme cases for method ParseLine 
    
    @Test
    void GetLastRead_AssignValidBookToBuffer_BufferIsEqualToTheLastBook()
    {
        char []Bookname= {'o','f','e','k'};
    	char []Authorname= {'o','f','e','k'};
    	char []Id= {'1','2','4','6'};
    	PRNParser prn=new PRNParser();
    	Book book=new Book(Bookname,Authorname,Id);
    	
    	prn.Parseline(book);
    	Assertions.assertEquals(book ,prn.GetLastRead());
    }
     
    
    
    
    
    
    
    //general commands that occur during every testing setup
    
    
    @BeforeAll
    static void setup(){
        System.out.println("Testing has begun");
    }
     
    @BeforeEach
    void setupThis(){
    	
        System.out.println("A new test is about to begin");
    }
    
    
    
    @AfterEach
    void AfterEachTest(){
        System.out.println("test is now complete, moving to the next(if there is)");
    }
     
    @AfterAll
    static void AtTheEnd(){
        System.out.println("all tests are now complete, each test result was passed");
    }

}
