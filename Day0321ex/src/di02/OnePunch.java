package di02;

import org.springframework.stereotype.Component;

@Component("one")
public class OnePunch implements Punch{
	public String getPunch(){
		return "원펀치 강냉이";
	}
}
