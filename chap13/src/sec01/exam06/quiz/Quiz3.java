package sec01.exam06.quiz;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Quiz3 {
	public static void main(String[] args) {
		
		Set<Equipment> setEqm1 = new HashSet<>();
		Set<Equipment> setEqm2 = new HashSet<>();
		
		setEqm1.add(new Equipment("라켓", 15000));
		setEqm1.add(new Equipment("배트", 6000));
		setEqm1.add(new Equipment("축구공", 3000));
        
		setEqm2.add(new Equipment("배트", 6000));
		setEqm2.add(new Equipment("야구공", 5000));
		setEqm2.add(new Equipment("글로브", 9000));
		
		Set<Equipment> union = new HashSet<>(setEqm1);
        union.addAll(setEqm2);

        Set<Equipment> intersection = new HashSet<>(setEqm1);
        intersection.retainAll(setEqm2);

        Set<Equipment> difference = new HashSet<>(setEqm1);
        difference.removeAll(setEqm2);

        System.out.println("*** 합집합 ***");
        Iterator<Equipment> it1 = union.iterator();
        while (it1.hasNext()) {
            System.out.println("- " + it1.next());
        }
        
        System.out.println("*** 교집합 ***");
        Iterator<Equipment> it2 = intersection.iterator();
        while (it2.hasNext()) {
            System.out.println("- " + it2.next());
        }

        System.out.println("*** 차집합 ***");
        Iterator<Equipment> it3 = difference.iterator();
        while (it3.hasNext()) {
            System.out.println("- " + it3.next());
        }
		
	}

}
