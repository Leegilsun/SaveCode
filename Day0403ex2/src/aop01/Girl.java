package aop01;

import java.util.Random;

public class Girl implements IPerson{

	@Override
	public String doSomeThing() {
		// TODO Auto-generated method stub
		System.out.println("드라마를 본다");
		if(new Random().nextBoolean())
			throw new FireException("화재발생");
		return "girl";
	}
}
