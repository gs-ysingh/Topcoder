import java.lang.reflect.Array;
import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class ConnectedComponentConstruction {
	
	public String[] construct(int[] s) {
		Map<Integer, Integer> map = new HashMap<>();
		Map<Integer, ArrayList<Integer>> map2 = new HashMap<>();
		String [] out = new String[0];
		for (int i = 0; i < s.length; i++) {
			if(map.get(s[i]) != null) {
				map.put(s[i], map.get(s[i]) + 1);
				map2.get(s[i]).add(i + 1);
			}
			else {
				map.put(s[i], 1);
				map2.put(s[i], new ArrayList());
				map2.get(s[i]).add(i + 1);
			}
		}

		int flag = 0;
		for(Integer key : map.keySet()) {
			if(key != map.get(key) && key != 1) {
				flag = 1;
				break;
			}
		}

		if(flag == 0) {
			int rank = 0;
			out = new String[s.length];
			char[] charArray = new char[s.length];
			Arrays.fill(charArray, 'N');
			String res = new String(charArray);
			for (int i = 0; i < s.length; i++) {
				rank = s[i];
				StringBuilder myName = new StringBuilder(res);
				if(rank != 1) {
					for (int j = 0; j < map2.get(rank).size(); j++) {
						if(map2.get(rank).get(j) - 1 != i) {
							myName.setCharAt(map2.get(rank).get(j) - 1, 'Y');
						}
					}
				}
				out[i] = myName.toString();
			}
		}
		return out;
	}
}
