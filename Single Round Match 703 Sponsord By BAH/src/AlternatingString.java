import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class AlternatingString {
	
	public int maxLength(String s) {
		int len = 1;
		int max = 1;

		for(int i = 1; i < s.length(); i++) {
			if(s.charAt(i) != s.charAt(i - 1)) {
				len++;
				max = Math.max(len, max);
			}
			else {
				len = 1;
			}
		}
		return max;
	}
}
