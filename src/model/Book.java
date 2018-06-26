package model;

public class Book {
	private String Id;
	public final String getId() {
		return Id;}
	public final void setId(String value) {
	}
	private String ISBN;
	public final String getISBN() {
		return ISBN;
	}
	public final void setISBN(String value) {
	}
	private String Title;
	public final String getTitle() {
		return Title;}
	public final void setTitle(String value) {
	}
	private Member LoanTo;
	 public Member getLoanTo()
	 {
		 return LoanTo;
	 }
     public void setLoanTo(Member value)
     {
    	 LoanTo = value;
     }

public Book(String Id,String ISBN,String Title){
	this.Id=Id;
	this.ISBN=ISBN;
	this.Title=Title;
}
}