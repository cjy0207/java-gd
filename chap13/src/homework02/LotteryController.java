package homework02;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LotteryController {
	private Set<Lottery> lottery = new HashSet<Lottery>();
	private Set<Lottery> win = new HashSet<Lottery>();
	
	public boolean insertObject(Lottery l) {
		return lottery.add(l);
	}
	
	public boolean deleteObject(Lottery l) {
		boolean removed = lottery.remove(l);
		if(removed && win != null) win.remove(l);
		return removed;
	}
	
	public Set<Lottery> searchObject(){
		return lottery;
	}
	
	public Set<Lottery> winObject(){
		if(lottery.size() < 4) return null;
	
		List<Lottery> list = new ArrayList<Lottery>(lottery);
		
	    List<Lottery> removed = new ArrayList<>();
	    for (Lottery w : win) {
	        if (!lottery.contains(w)) {
	            removed.add(w);
	        }
	    }
	    for (Lottery r : removed) {
	        win.remove(r);
	    }

	    while (win.size() < 4) {

	        int idx = (int)(Math.random() * list.size());

	        Lottery pick = list.get(idx);

	        if (win.contains(pick)) {
	            continue;
	        }

	        win.add(pick);
	    }

	    return win;
	}
	
	public Set<Lottery> sortedWinObject(){
		Set<Lottery> sorted = new TreeSet<Lottery>(win);
		return sorted;
	}
	
	public boolean searchWinner(Lottery l) {
		return win.contains(l);
	}
}