package aop02ex;

import org.springframework.stereotype.Component;

@Component
public class Lol implements	IGame{
	public void doGame(){
		System.out.println("롤에서 부모님 안부를 묻는다");
	}
}
