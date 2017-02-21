import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class Robofactory {
	
	public int reveal(int[] query, String[] answer) {
		int n = answer.length;
		for (int i = 0; i < n; i++) {
			if(query[i] % 2 == 0 && answer[i].equals("Odd")) {
				return i;
			}
			if(query[i] % 2 == 1 && answer[i].equals("Even")) {
				return i;
			}
		}

		boolean [] bol = new boolean[n];

		for (int i = 1; i < n; i++) {
			if(query[i - 1] % 2 == 1) {
				bol[i] = true;
			}
		}

		int count = 0;

		for (int i = 0; i < n; i++) {
			if(!bol[i]) count++;
		}
		if(count > 1) return -1;

		return 0;
	}
}
