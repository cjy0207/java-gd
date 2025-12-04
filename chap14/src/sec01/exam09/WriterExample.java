package sec01.exam09;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterExample {

	public static void main(String[] args) {

		try (Writer writer = new FileWriter("/Users/choejiyun/Desktop/workspace/test9.txt");) {

			char[] arr = {'A', 'B', 'C', 'D', 'E'};
			

			writer.write(arr, 1, 3);

			writer.flush();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
