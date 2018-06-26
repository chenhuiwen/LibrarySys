package model;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Member {
	private String Id;
	private String name;
	private ArrayList<Loan> Loans=new ArrayList();
	public final void Return(Book book)
			{
		 for (Loan loan : Loans) {
	         Book bookInLoan = loan.getBook();
	         if (bookInLoan.getId().equals(book.getId())) {
	             bookInLoan.setLoanTo(null);
	             System.out.println(LocalDateTime.now() + ":" + getName() + "已归还" + book.getTitle() + "。");
	             loan.MarkAsReturned();
	         }
		 }
		
			}
	public final boolean CanLoan(Book book)
	{
		
		 if (book.getLoanTo() != null) {
	          System.out.println( book.getTitle() + "图书已经借出！");
	          return false;
	      }
	      HasReachMaxSpecification specification = new HasReachMaxSpecification();
	      if (!specification.IsSatisfiedBy(this)) {
	    	 
	          return false;
	     }
	 LoanOnlyOneSpecification loanOnlyOneSpecification = new LoanOnlyOneSpecification(book);
	   return loanOnlyOneSpecification.IsSatisfiedBy(this);
		
		  
	}			
    public final Loan loan(Book book)
    {
    	Loan loan=null;
    	if(CanLoan(book))
    	{
    		loan=LoanFactory.CreateLoan(book,this);
    		getLoans().add(loan);
    	}
    	return loan;
    }
    public Loan FindCurrentLoanFor(Book book)
    {
    	 Member loanTo = book.getLoanTo();
    	 
         if (loanTo == null || !loanTo.getId().equals(this.getId())) {
             return null;
         }
         for (Loan loan : Loans) {
       	 
             if (loan.getBook().getId().equals(book.getId()) && loan.HasNotBeenreturned()) {
                 System.out.println(LocalDateTime.now() + ":" + name + "借了" + book.getTitle() );
                 return loan;
             }
         }
         System.out.println(LocalDateTime.now() + ":" + name + "没有借" + book.getTitle() );
         return null;
    }
   
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Loan> getLoans() {
		return Loans;
	}
	public void setLoans(ArrayList<Loan> loans) {
		Loans = loans;
	}
	 public Member(String Id,String name){
		  this.Id=Id;
		  this.name=name;
	  }
}
