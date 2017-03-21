package di01;

public class Player {
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
}
