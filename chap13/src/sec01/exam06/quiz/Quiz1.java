package sec01.exam06.quiz;

import java.util.HashSet;
import java.util.Set;

public class Quiz1 {

	public static void main(String[] args) {
		Set<Song> songSet1 = new HashSet<Song>();
		Set<Song> songSet2 = new HashSet<Song>();
		
		songSet1.add(new Song("APT", "로제"));
		songSet1.add(new Song("Whiplash", "에스파"));
		songSet1.add(new Song("POWER", "G-DRAGON"));
		
		songSet2.add(new Song("Whiplash", "에스파"));
		songSet2.add(new Song("HAPPY", "DAY6"));
		songSet2.add(new Song("HAPPY", "DAY6"));
		
		System.out.println(songSet1);
		System.out.println(songSet2);
		
		
	}

}
