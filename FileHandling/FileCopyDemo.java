package FileHandling;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyDemo {

	public static void main(String[] args) throws IOException {
		
		
		String sourcePath = "C:\\Users\\garim\\OneDrive\\Documents\\Java\\file\\songs\\video.mp4";
		String desPath = "C:\\Users\\garim\\OneDrive\\Documents\\Java\\file\\songs\\copyfile.mp4";
		
		File file = new File(sourcePath);
		
		if(!file.exists()) {
			System.out.println("Can't copy file");
			return;
		}
		
		System.out.println("Data Copying");
		
		FileInputStream fs = new FileInputStream(file);
		BufferedInputStream bs = new BufferedInputStream(fs);
		
		FileOutputStream fo = new FileOutputStream(desPath);
		BufferedOutputStream bo = new BufferedOutputStream(fo);
		
		long startTime = System.currentTimeMillis();
		
		int singleByte = bs.read();
		final int EOF = -1;
		
		while(singleByte != EOF) {
			bo.write(singleByte);
			singleByte = bs.read();
		}
		
		bs.close();
		bo.close();
		fo.close();
		fs.close();
		
		long endTime = System.currentTimeMillis();
		
		System.out.println("Data Copied: "+(endTime - startTime)+"ms");

	}

}
