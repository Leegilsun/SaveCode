package di02;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("player")
public class Player {
	@Autowired(required=false)
	@Qualifier("two")
	private Punch punch;
	
//	//생성자 주입
//	public Player(){
//		
//	}
//	public Player(Punch punch){
//		this.punch = punch;
//	}
	
	//설정자
	public void setPunch(Punch punch){
		this.punch = punch;
		
	}
	
	public void play(){
		System.out.println(punch.getPunch());
	}
	
	@PostConstruct
	public void init(){
		//의존관계가 정부 생성하고 나서 다음  당장 getBean해서 사용해도 되는 상황에 호출
		System.out.println("응 생성");
	}
}
