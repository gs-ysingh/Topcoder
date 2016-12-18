import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class BinaryCode {
	
	public String[] decode(String message) {
		String P = "0";
		String Q = message;
		int size = Q.length();
		int value = 0;
		String[] result = new String[2];
		for (int j = 0; j < 2; j++) {
			for (int i = 0; i < size; i++) {
				if(i == 0) {
					value = Character.getNumericValue(Q.charAt(i))  - Character.getNumericValue(P.charAt(i));
				}
				else if(i == size - 1) {
					value = Character.getNumericValue(Q.charAt(i))  - Character.getNumericValue(P.charAt(i - 1));
				}
				else {
					value = Character.getNumericValue(Q.charAt(i))
							- Character.getNumericValue(P.charAt(i - 1))
							- Character.getNumericValue(P.charAt(i));
				}
				if(value > 1 || value < 0) {
					P = "NONE";
					break;
				}
				else if(i != size - 1) {
					P = P + Integer.toString(value);
				}
			}
			result[j] = P;
			P = "1";
		}
		return result;
	}
}
