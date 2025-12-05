package homework.homework01;

import java.io.IOException;

public class Run {

	public static void main(String[] args) throws IOException {
		Practice practice = new Practice();

		String song = "나비야, 나비야 이리 날아오너라" + "\n노랑나비, 흰 나비 춤을 추며 오너라" + "\n봄바람에 꽃잎도 방긋방긋 웃으며" + "\n참새도 짹짹짹 노래하며 춤춘다";

		long start = System.nanoTime();
		practice.method1(song);
		long end = System.nanoTime();
		long time = end - start;
		

		long start2 = System.nanoTime();
		practice.method2(song);
		long end2 = System.nanoTime();
		long time2 = end2 - start2;
		
		System.out.println("method1 소요시간: " + time + ", method2 소요시간 : " + time2);

	}

}
