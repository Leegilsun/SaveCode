package proxy;

public class GameProxy implements Game{
	private Game game;
	public void setGame(Game game){
		this.game = game;
	}
	@Override
	public void doGame() {
		// TODO Auto-generated method stub
		try{
			System.out.println("피시방을 간다.");
			game.doGame();
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			System.out.println("집을 간다.");
		}
	}
	
}
