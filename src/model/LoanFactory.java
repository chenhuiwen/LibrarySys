package model;

import java.time.LocalDateTime;
import java.util.UUID;

public class LoanFactory {
	public static Loan CreateLoan(Book book,Member member) {
		book.setLoanTo(member);
		Loan loan=new Loan();
	    loan.setBook (book);
        loan.setMember (member);
        loan.setLoanDate (LocalDateTime.now());
        loan.setDateForReturn (LocalDateTime.now().plusDays(10));
        System.out.println(book.getTitle()+"借书成功");
        return loan;
	}

}
