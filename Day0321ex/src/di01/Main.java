package di01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new GenericXmlApplicationContext("di01/applicationContext.xml");
		
		Player player = context.getBean("player", Player.class);
		Punch punch = context.getBean("punch", Punch.class);
		
		player.play();
	}
}
