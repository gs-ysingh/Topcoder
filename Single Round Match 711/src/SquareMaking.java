import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class SquareMaking {
	
	public int getMinimalPrice(int a, int b, int c, int d) {
		int size = 4;
		int [] arr = new int[size];
		arr[0] = a;
		arr[1] = b;
		arr[2] = c;
		arr[3] = d;

		int min = Integer.MAX_VALUE;
		int sum = 0;

		for (int i = 0; i < size; i++) {
			sum = 0;
			for (int j = 0; j < size; j++) {
				sum = sum + Math.abs(arr[i] - arr[j]);
			}
			min = Math.min(sum, min);
		}

		return min;
	}
}
