package step5;



public class TestFile5 {
	public static void main(String[] args) {
		FileService service=new FileService();
		String path="C:\\java-kosta\\util\\eclipse-jee-oxygen-2-win32-x86_64\\eclipse\\eclipse.exe";
		//System.out.println(new File(path).isFile()); //파일 ture 확인
		service.printDirNames(path);
		/* path에 해당하는 파일과 같은 위치에 있는
		 * 디렉토리명들만 모두 출력한다.
		 */

	}
}
