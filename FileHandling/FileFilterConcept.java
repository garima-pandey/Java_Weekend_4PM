package FileHandling;

import java.io.File;
import java.io.FilenameFilter;

class MyFilter implements FilenameFilter {
	@Override
	public boolean accept(File dirPath, String fileName) {
		return fileName.endsWith(".txt");
	}
}

public class FileFilterConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String path = "C:\\Users\\garim\\OneDrive\\Documents\\Java\\file\\songs";
		
		File file = new File(path);
		
		MyFilter filter = new MyFilter();
		
		File files[] = file.listFiles(filter);
		
		System.out.println(files.length);

	}

}
