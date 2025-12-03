package homework.homework03;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class MemberController {
	// HashMap 객체 생성
	Map<String, Member> map = new HashMap<String, Member>();
	
	public boolean joinMember(String id, Member m) {
		// 1. 전달 받은 id가 없다면 id와 m을 map에 추가후 true 반환
		// -> containsKey로 판단
		// 2. 이미 있다면 false 값 반환
		if(map.containsKey(id)) return false;
		map.put(id, m);
		return true;
	}
	
	public String logIn(String id, String password) {
		// 1. 전달 받은 id가 존재하는지 확인
		// -> containsKey로 판단
		// 2. 존재하면 Member에 저장된 비밀번호와 사용자가 입력한 비밀번호 비교
		// 3. 같다면 저장된 Member의 이름 반환
		// 4. 그 외의 모든 상황에서는 null 반환
		if(!map.containsKey(id)) return null;
		
		Member member = map.get(id);
		if(!member.getPassword().equals(password)) return null;
		
		return member.getName();
		
	}
	
	public boolean changePassword(String id, String oldPw, String newPw) {
		// 1. 아이디가 존재하면서 
		// + 저장된 비밀번호와 사용자가 입력한 비밀번호가 같을 때
		// 2. 새로운 비밀번호로 바꾸고 true 반환
		// 3. 그 외의 모든 상황에서는 false 반환
		if(!map.containsKey(id)) return false;
		Member member = map.get(id);
		if(!member.getPassword().equals(oldPw)) return false;
		
		member.setPassword(newPw);
		return true;
	}
	
	public void changeName(String id, String newName) {
		Member member = map.get(id);
		member.setName(newName);
	}
	
	public TreeMap<String, String> sameName(String name) {
	    TreeMap<String, String> result = new TreeMap<>();

	    Iterator<Map.Entry<String, Member>> iter = map.entrySet().iterator();

	    while (iter.hasNext()) {
	        Map.Entry<String, Member> entry = iter.next();

	        String id = entry.getKey();
	        Member m = entry.getValue();

	        if (m.getName().equals(name)) {
	            result.put(id, m.getName());
	        }
	    }

	    return result;
	}
}