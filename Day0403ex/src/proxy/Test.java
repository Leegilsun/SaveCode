package proxy;
//수도코드

//피시방을 간다
//롤을한다 / 오버워치를 한다
//부모님 안부를 묻는다 (같은 편이 트롤짓을 하면)
//피시방을 나온다
public class Test {
	public static void main(String[] args) {
		Game game = new lol();
		GameProxy gameProxy = new GameProxy();
		gameProxy.setGame(game);
		gameProxy.doGame();
	}
}
