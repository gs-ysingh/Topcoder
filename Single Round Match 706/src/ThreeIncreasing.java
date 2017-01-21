import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class ThreeIncreasing {
	
	public int minEaten(int a, int b, int c) {
		int count = 0;

		while((a >= b || b >= c) && a >= 1 && b >= 1 && c >= 1 ) {
			if(a >= b) {
				count = count + a - b + 1;
				a = b - 1;
			}

			if(b >= c) {
				count = count + b - c + 1;
				b = c - 1;
			}
		}

		if(a >= b || b >= c || a < 1 || b < 1 || c < 1) {
			return -1;
		}
		return count;
	}
}
