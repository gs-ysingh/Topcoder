import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class StringTransform {
	
	public String isPossible(String s, String t) {
		Set<Character> characters = new HashSet<>();

		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i) != t.charAt(i)
					&& !characters.contains(t.charAt(i))) {
				return "Impossible";
			}
			characters.add(s.charAt(i));
		}

		return "Possible";
	}
}
