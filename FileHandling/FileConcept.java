package FileHandling;

import java.io.File;
import java.io.IOException;

public class FileConcept {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String path = "C:\\Users\\garim\\OneDrive\\Documents\\Java\\file\\file.txt";
		File file = new File(path);
		
		if(file.exists()) {
			File file2 = new File("C:\\Users\\garim\\OneDrive\\Documents\\Java\\file\\copy.txt");
			file.renameTo(file2);
//			file.delete();
//			System.out.println("File Deleted");
		}
		else {
			file.createNewFile();
			System.out.println("File Created");
		}
		
		path = "C:\\Users\\garim\\OneDrive\\Documents\\Java\\file\\abc\\xy\\xz";
		
		file = new File(path);
		
//		file.mkdir(); // make a directory/ folder
		file.mkdirs();
	}

}
