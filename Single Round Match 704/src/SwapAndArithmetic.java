import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class SwapAndArithmetic {
	
	public String able(int[] x) {
		Arrays.sort(x);

		String out = "Possible";
		int d = 0;
		if(x.length >= 2) {
			d = x [1] - x[0];
		}

		for (int i = 1; i < x.length; i++) {
			if(x[i] - x[i - 1] != d) {
				out = "Impossible";
				break;
			}
		}

		return out;
	}
}
