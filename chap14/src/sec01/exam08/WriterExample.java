package sec01.exam08;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterExample {

	public static void main(String[] args) {

		try (Writer writer = new FileWriter("/Users/choejiyun/Desktop/workspace/test8.txt");) {

			char[] arr = {'A', 'B', 'C'};

			writer.write(arr);

			writer.flush();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
