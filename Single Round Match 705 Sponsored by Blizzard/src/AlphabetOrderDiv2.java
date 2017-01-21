import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class AlphabetOrderDiv2 {
	
	public String isOrdered(String[] words) {
		int len = words.length;
		String out = "Possible";
		Map<Character, Integer> m = new HashMap<Character, Integer>();
		int count = 1;
		for (int i = 0; i < len; i++) {
			String str = words[i];
			Map<Character, ArrayList<Integer>> map = new HashMap<Character, ArrayList<Integer>>();
			ArrayList<Integer> arr = new ArrayList<>();
			int flag = 1;
			for (int j = 0; j < str.length(); j++) {
				if(j > 0) {
					if(!map.containsKey(str.charAt(j))) {
						map.put(str.charAt(j), new ArrayList<>());
					}
					arr = map.get(str.charAt(j));
					arr.add(m.get(str.charAt(j - 1)));
					map.put(str.charAt(j), arr);
				}
				if(!m.containsKey(str.charAt(j))) {
					m.put(str.charAt(j), count++);
				}
				else {
					int possibleIndex = m.get(str.charAt(j));
					for (int k = 0; k < arr.size(); k++) {
						if(possibleIndex < arr.get(k)) {
							out = "Impossible";
							flag = 0;
							break;
						}
					}
					if(flag == 0) {
						break;
					}
				}
			}
		}
		return out;
	}
}
