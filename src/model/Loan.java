package model;

import java.time.LocalDateTime;

public class Loan {
	private String Id;
	private java.time.LocalDateTime LoanDate;
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public java.time.LocalDateTime getLoanDate() {
		return LoanDate;
	}
	public void setLoanDate(java.time.LocalDateTime loanDate) {
		LoanDate = loanDate;
	}
	public java.time.LocalDateTime getDateForReturn() {
		return DateForReturn;
	}
	public void setDateForReturn(java.time.LocalDateTime dateForReturn) {
		DateForReturn = dateForReturn;
	}
	public java.time.LocalDateTime getReturnDate() {
		return ReturnDate;
	}
	public void setReturnDate(java.time.LocalDateTime returnDate) {
		ReturnDate = returnDate;
	}
	public Book getBook() {
		return Book;
	}
	public void setBook(Book book) {
		Book = book;
	}
	public Member getMember() {
		return Member;
	}
	public void setMember(Member member) {
		Member = member;
	}
	private java.time.LocalDateTime DateForReturn;
	private java.time.LocalDateTime ReturnDate;
	private Book Book;
	private Member Member;
	public boolean HasNotBeenreturned()
	{
		return ReturnDate==null;
	}
	public void MarkAsReturned()
	{
		ReturnDate = LocalDateTime.now();
	}

}
