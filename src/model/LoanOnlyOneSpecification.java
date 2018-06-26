package model;

import java.time.LocalDateTime;

public class LoanOnlyOneSpecification implements ISpecification<Member>{
	private Book wantBook;

	public Book getWantBook() {
		return wantBook;
	}

	public void setWantBook(Book wantBook) {
		this.wantBook = wantBook;
	}
	public LoanOnlyOneSpecification(Book wantBook) {
	     this.wantBook = wantBook;
	 }
	@Override
	public boolean IsSatisfiedBy(Member entity) {
		 boolean b = entity.getLoans().stream().noneMatch(loan -> loan.HasNotBeenreturned() && loan.getBook().getISBN().equals(wantBook.getId()));
		        if (!b) {
		            System.out.println(LocalDateTime.now() + ":" + entity.getName() + "已经借了" + wantBook.getTitle());
		        }
		        return b;
	}

}
