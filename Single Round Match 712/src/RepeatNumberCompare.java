import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class RepeatNumberCompare {
	
	public String compare(int x1, int k1, int x2, int k2) {
		String str1 = "";
		for (int i = 0; i < k1; i++) {
			str1 += String.valueOf(x1);
		}

		String str2 = "";
		for (int i = 0; i < k2; i++) {
			str2 += String.valueOf(x2);
		}

		if(new BigInteger(str1).compareTo(new BigInteger(str2)) > 0) {
			return "Greater";
		}
		else if(new BigInteger(str1).compareTo(new BigInteger(str2)) == 0) {
			return "Equal";
		}
		return "Less";
	}
}
