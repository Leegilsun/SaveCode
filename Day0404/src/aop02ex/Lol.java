package aop02ex;

import java.util.Random;

import org.springframework.stereotype.Component;


@Component
public class Lol implements	IGame{
	public String doGame(){
		System.out.println("롤에서 부모님 안부를 묻는다");
		if(new Random().nextBoolean())
			throw new FireException("정전발생 ");
		return "내일도 와야지~";
	}
}
