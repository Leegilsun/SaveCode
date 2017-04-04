package aop01ex;

public class GameAspect {
	public void doBefore(){
		System.out.println("피시방에 들어간다");
	}
	
	public void doAfterReturning(){
		System.out.println("피시방에서 나간다");
	}
	
	public void doAfterThrowing(){
		System.out.println("부모님 안부를 묻는다");
	}
	
	public void doAfter(){
		System.out.println("집으로 간다");
	}
}
