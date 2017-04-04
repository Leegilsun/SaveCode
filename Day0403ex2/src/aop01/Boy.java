package aop01;

import java.util.Random;

public class Boy implements IPerson{

	@Override
	public String doSomeThing() {
		// TODO Auto-generated method stub
		System.out.println("컴퓨터로 게임을 한다.");	//실제 기능을 구현하는 인터페이스의 구현 클래스
		if(new Random().nextBoolean())
			throw new FireException("화재발생");
		
		return "boy";
	}
}
