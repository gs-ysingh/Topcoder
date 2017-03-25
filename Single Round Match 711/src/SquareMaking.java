import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class SquareMaking {
	
	public int getMinimalPrice(int a, int b, int c, int d) {
		int [] arr = new int[4];
		int p = Math.abs(a - b) +  Math.abs(a - c) +  Math.abs(a - d);
		int q = Math.abs(b - a) +  Math.abs(b - c) +  Math.abs(b - d);
		int r = Math.abs(c - a) +  Math.abs(c - b) +  Math.abs(c - d);
		int s = Math.abs(d - b) +  Math.abs(d - a) +  Math.abs(d - c);

		arr[0] = p;
		arr[1] = q;
		arr[2] = r;
		arr[3] = s;

		int min = Integer.MAX_VALUE;
		for (int i = 0; i < 3; i++) {
			min = Math.min(arr[i], min);
		}

		return min;
	}
}
