package sec04.exam04;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) throws IOException, URISyntaxException {

		//파일 경로 객체 얻기
		Path path = Paths.get(StreamExample.class.getResource("data.txt").toURI());
		//Path로 파일을 열고 한 행씩 읽으면서 문자열 스트림 생성, 기본 UTF-8로 읽음
		Stream<String> stream = Files.lines(path, Charset.defaultCharset());
		stream.forEach(line -> System.out.println(line));
		stream.close();
		
		

	}

}
