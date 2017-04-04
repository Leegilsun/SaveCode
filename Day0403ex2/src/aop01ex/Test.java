package aop01ex;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext; 

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new GenericXmlApplicationContext("aop01ex/applicationContext.xml");
		IGame game = context.getBean("lol", IGame.class);
		game.doGame();
	}
}
