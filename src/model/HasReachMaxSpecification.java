package model;

import java.time.LocalDateTime;

public class HasReachMaxSpecification implements ISpecification<Member>{
	@Override
	public boolean IsSatisfiedBy(Member entity)
	{
		int max = 3;
        boolean b = entity.getLoans().stream().filter(Loan::HasNotBeenreturned).count() < max;
        if (!b) {
        	System.out.println(LocalDateTime.now()+":"+entity.getName()+"借书数量已达到"+max+"本");
        }
        return b;
	}


}
