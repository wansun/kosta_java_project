package step9;

public class PlayerService {
	private Player[] player;
	private int count;
	public PlayerService(int length) {
		player=new Player[length];
	}
	
	public void add(Player p) {
		player[count++]=p;
	}
	public void executeAll() {
		for(int i=0;i<count;i++)
			player[i].play();
	}
	
}
