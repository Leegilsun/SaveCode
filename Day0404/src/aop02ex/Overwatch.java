package aop02ex;

import org.springframework.stereotype.Component;

@Component
public class Overwatch implements IGame{
	public void doGame(){
		System.out.println("오버워치에서 부모님 안부를 묻는다.");
	}
}
