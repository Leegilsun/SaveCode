package aop02ex;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
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
//	@Before("pt()")
	public void doBefore(){
		System.out.println("피시방에 간다");
	}
//	@AfterReturning(pointcut= "pt()", returning="rt")
	public void doAfterReturning(String rt){
		System.out.println("게임을 끈다"+ rt);
	}
//	@AfterThrowing(pointcut="pt()", throwing="th")
	public void doAfterThrowing(Throwable th){
		System.out.println(th.getMessage() + " : 부들부들거린다.");
	}
//	@After("pt()")
	public void doAfter(){
		System.out.println("피시방을 나온다");
	}
	
	@Around("pt()")
	public void around(ProceedingJoinPoint jp){
		doBefore();
		try {
			String rt = (String) jp.proceed();
			doAfterReturning(rt);	//반환값은 proceed의 반환값 
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			doAfterThrowing(e);		//예외값은 발생한 catch구문에서 
		}
		finally{
			doAfter();
		}
	}
}
