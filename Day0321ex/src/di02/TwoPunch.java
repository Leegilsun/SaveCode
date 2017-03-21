package di02;

import org.springframework.stereotype.Component;

@Component("two")
public class TwoPunch implements Punch{
	public String getPunch(){
		return "투펀치 투강냉이";
	}
}
