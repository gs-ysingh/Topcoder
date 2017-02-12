import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class SafeBetting {
	
	public int minRounds(int a, int b, int c) {
		int x = 0;
		int bets = 0;

		while (b < c) {
			x = b - a;
			b = b + x;
			bets++;
		}

		return bets;
	}
}
