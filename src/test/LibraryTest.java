package test;

import java.time.LocalDateTime;

import org.junit.Test;

import model.Book;
import model.Member;

public class LibraryTest {
	@Test
	public void Test() {
		Book book1=new Book("001","a001","网络营销");
		Book book2=new Book("002","a002","数据库");
		
		Member member1=new Member("01","陈慧文");
		Member member2=new Member("02","徐婉云");
		 System.out.println(book1.getTitle());
		 System.out.println(member1.getName());
		 System.out.println(member1.getName()+"借"+book1.getTitle());
		 if (member1.CanLoan(book1)) {
	         member1.loan(book1);
	     }
		 System.out.println(LocalDateTime.now()+member1.getName()+"成功借书"+book1.getTitle());
		 if (member1.CanLoan(book1)) {
	         member1.loan(book1);
	     }
		 
		 System.out.println(LocalDateTime.now()+"还书");
	     member1.Return(book1);
	     System.out.println(LocalDateTime.now()+member2.getName()+"借"+book2.getTitle());
	     if (member2.CanLoan(book2)) {
	         member2.loan(book2);
	     }

	     System.out.println(member2.FindCurrentLoanFor(book2));
	}

}
