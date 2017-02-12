import java.util.*;
import java.math.*;
import static java.lang.Math.*;


//Need to again check for any better approach

public class BuildingStrings {
	
	public String[] findAny(int K) {
		ArrayList<String> arr = new ArrayList<>();

		while (true) {
			int limit = 50;
			while (limit * limit > K) {
				limit--;
			}

			if(limit < 50) {
				arr.add(getStringOfScore(limit));
				int rem = 0;
				if(K - limit * limit > 0) {
					rem = K - limit * limit;
					if(rem <= 26) {
						arr.add(getStringOfDup(rem, 1));
						break;
					}
					else {
						K = rem;
					}

				}
				else {
					break;
				}
			}
			else {
				int sum = 0;
				int x = 1;
				while (sum < K) {
					arr.add(getStringOfScore(50));
					sum = sum + 1250;
				}

				sum = sum - 1250;

				if(sum > 0) {
					 K = K - sum;
				}
				else {
					break;
				}
			}

		}

		return arr.toArray(new String[arr.size()]);
	}

	public String getStringOfDup(int limit, int i) {
		String x = "abcdefghijklmnopqrstuvwxyz";
		String k =  x.substring(0, limit);

		StringBuilder myName = new StringBuilder(k);

		for (int j = i; j < k.length(); j++) {
			myName.setCharAt(j, myName.charAt(0));
		}

		return myName.toString();
	}

	public String getStringOfScore(int limit) {
		String y = "aabbccddeeffgghhiijjkkllmmnnooppqqrrssttuuvvwwxxyyz";
		String x = "abcdefghijklmnopqrstuvwxyz";
		if(limit <= 26) {
			return x.substring(0, limit);
		}
		else {
			return y.substring(0, limit);
		}

	}
}
