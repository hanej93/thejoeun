package day0324.execeptionEx04;

import java.util.HashMap;
import java.util.Map;

public class Join {

	private Map<String, String> userMap = new HashMap<String, String>();
	
	public void join(String id, String pw) throws DuplicationIdException {
		
		for(String key : userMap.keySet()) {
			if(key.equals(id)) {
				throw new DuplicationIdException();
			}
		}
		
		userMap.put(id, pw);
		
	}
	
	public Map<String,String> getUserMap() {
		return userMap;
	}
	
	
}
