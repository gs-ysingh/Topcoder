import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class SellingFruits {
	
	public int maxDays(int x, int f, int d, int p) {
		int i = (d - (x * f));
		int j = x + p;
		int t = i / j;

		if(d < x * f) {
			return d / x;
		}

		return f + t;
	}
}
