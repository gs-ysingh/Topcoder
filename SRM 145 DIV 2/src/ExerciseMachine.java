import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class ExerciseMachine {

	public int getPercentages(String time) {
		String[] str = time.split(":");
		int sec = Integer.parseInt(str[0])  * 3600 + Integer.parseInt(str[1]) * 60 + Integer.parseInt(str[2]);
		int count = 0;
		for (int i = 1; i < 100; i++) {
			if(sec * i % 100 == 0) {
				count++;
			}
		}
		return count;
	}
}
