package aop02;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class Girl implements IPerson{

	@Override
	public String doSomeThing() {
		// TODO Auto-generated method stub
		System.out.println("드라마를 본다");
		return "girl";
	}
}
