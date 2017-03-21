package di02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new GenericXmlApplicationContext("di02/applicationContext.xml");
		
		Player player = context.getBean("player", Player.class);
		
		player.play();
	}
}
