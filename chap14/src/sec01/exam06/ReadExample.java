package sec01.exam06;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;

public class ReadExample {
	
	public static void main(String[] args) {
		
		try(InputStream is = new FileInputStream("/Users/choejiyun/Desktop/workspace/test3.txt")){
			
			byte[] buffer = new byte[5];
			
			int readByteNum = is.read(buffer, 2, 3);
			if(readByteNum != -1) {
				for (int i = 0; i < buffer.length; i++) {
					System.out.println(buffer[i]);
				}
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
