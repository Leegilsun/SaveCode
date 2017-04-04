package aop02ex;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
@Component
@Aspect
public class GameAspect {
	@Pointcut("execution(public * aop02ex.*.doGame(..))")
	public void pt(){
		
	}
	@Before("pt()")
	public void doBefore(){
		System.out.println("피시방에 간다");
	}
	@AfterReturning("pt()")
	public void doAfterReturning(){
		System.out.println("게임을 끈다");
	}
	@AfterThrowing("pt()")
	public void doAfterThrowing(){
		System.out.println("부들부들거린다.");
	}
	@After("pt()")
	public void doAfter(){
		System.out.println("피시방을 나온다");
	}
}
