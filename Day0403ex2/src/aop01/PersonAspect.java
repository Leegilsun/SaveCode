package aop01;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class PersonAspect {
	//공통 관심사항을 구현 할 클래스
	//시점 별로 함수로 구현할 코드를 작성
	public void doBefore(JoinPoint jp){ 
//		jp.getTarget();	//포인트컷 발생할 객체
//		System.out.println(jp.getSignature());	//JoinPoint매개변수로 주면 요기로 컷에대한 정보가 들어옴
		System.out.println("문을 열고 집에 들어간다");
	}
	
	public void doAfterReturning(String st){
		System.out.println("불을 끄고 잔다" + st);
	}
	
	public void doAfterThrowing(Throwable th){
		System.out.println(th.getMessage() + " : 119에 신고한다");
	}
	
	public void doAfter(){
		System.out.println("문을 열고 집을 나온다");
	}
	
	public void around(ProceedingJoinPoint jp){
		doBefore(jp);
		try {
			String st = (String) jp.proceed();
			doAfterReturning(st);	//반환값은 proceed의 반환값 
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			doAfterThrowing(e);		//예외값은 발생한 catch구문에서 
		}
		finally{
			doAfter();
		}
	}
}
