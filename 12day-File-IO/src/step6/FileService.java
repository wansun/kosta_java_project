package step6;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileService {

	public void createDirAndFile(String path) throws IOException {
		File file=new File(path);
		System.out.println(path);
		file.getParentFile().mkdirs(); 
		file.createNewFile();
		
		/*File file1=new File(file.getPath()+File.separator+"media");
		//System.out.println(file.exists());
		boolean flag=file.mkdirs();
		
		File file2=new File(file.getPath()+File.separator+"movie");
		
		boolean flag2=file.createNewFile();*/
		
		
		
	}

}
