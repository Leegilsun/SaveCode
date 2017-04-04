package aop02;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component	//bean으로 등록하겠음
@Aspect		//Aspect로 사용하겠음
public class PersonAspect {
	@Before("execution(public * aop02.*.doSomeThing(..))")
	public void doBefore(){
		System.out.println("문을 열고 집에 들어간다.");
	}
	
	@AfterReturning("execution(public * aop02.*.doSomeThing(..))")
	public void doAfterReuturning(){
		System.out.println("불을 끄고 잔다.");
	}
	
	@AfterThrowing("execution(public * aop02.*.doSomeThing(..))")
	public void doAfterThrowing(){
		System.out.println("119에 신고한다.");
	}
	
	@After("execution(public * aop02.*.doSomeThing(..))")
	public void doAfter(){
		System.out.println("집에서 나간다");
	}
}
