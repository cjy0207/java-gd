package homework.homework01;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Practice {
	
	public void method1(String str) throws IOException {
		FileOutputStream fos = new FileOutputStream("/Users/choejiyun/Desktop/test/sub/나비야1.dat");
		byte[] data = str.getBytes();
		fos.write(data);
		fos.close();
	}
	
	public void method2(String str) throws IOException {
		FileOutputStream fos = new FileOutputStream("/Users/choejiyun/Desktop/test/sub/나비야2.dat");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		byte[] data = str.getBytes();
		bos.write(data);
		bos.flush();
		bos.close();
		
	}

}
