package step5;

import java.io.File;

public class FileService {

	public void printDirNames(String path) {
		
		/*File file=new File(path);
		  File dir=file.getParentFile();
	   	  File fa[]=dir.listFiles();//선생님*/
		
/*		  for(int i=0;i<fa.length;i++) {
			  if(fa[i].isDirectory()) {
				  System.out.println(fa[i].getName());
			  }
		  }//선생님*/
		
		/*System.out.println(p.isFile());
		System.out.println(p.getParent());//틀린것 */
/*		File p=new File(path);
		File dir=new File(p.getParent());
		File[] fobj=dir.listFiles();
		
		for(int i=0;i<fobj.length;i++) {
			if(fobj[i].isDirectory()) {
				System.out.println(fobj[i].getName());
			}
		}*/
		
		File file=new File(path);
		File dir=file.getParentFile();
		File fa[]=dir.listFiles();
		
		for(int i=0;i<fa.length;i++) {
			if(fa[i].isDirectory()) {
				System.out.println(fa[i].getName());
			}
		}
	}

}
