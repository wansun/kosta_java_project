package step9;

public class TestInterface3 {
	public static void main(String[] args) {
		PlayerService service=new PlayerService(10);
		service.add(new GomPlayer());
		service.add(new AlSongPlayer());
		service.add(new CDPlayer());
		service.executeAll();
		/* 곰플레이어가 동영상을 재생하다
		 * 알송플레이어가 음악을 재생하다
		 * 시디플레이어가 cd를 재생하다
		 */
	}
}
