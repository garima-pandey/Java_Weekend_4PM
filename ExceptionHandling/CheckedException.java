package ExceptionHandling;
import java.io.File;
import java.io.IOException;

public class CheckedException {

	public static void main(String[] args) {
	
		try {
			String path = "C:\\Users\\garim\\OneDrive\\Documents\\Java\\"
					+ "file123\\xyz.txt";
			File file = new File(path);
			
			if(file.exists()) {
				System.out.println("Yes this file is exist");
				file.delete();
			} else {
				file.createNewFile();
				System.out.println("File Created");
			}
		}
		catch(Exception e) {
			System.out.println("System Issue"+e);
		}
//		catch(IOException e) {
//			System.out.println("File can't be create");
//		}
	}

}
