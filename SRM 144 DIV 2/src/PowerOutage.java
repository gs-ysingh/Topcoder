import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class PowerOutage {

	public int estimateTimeOut(int[] fromJunction, int[] toJunction, int[] ductLength)
	{
		int fullTime = 0;
		for(int timeSpan : ductLength) {
			fullTime += timeSpan * 2;
		}

		return fullTime - this.GetBiggestTimeSpanFrom(0, fromJunction, toJunction, ductLength);
	}

	private int GetBiggestTimeSpanFrom(int start, int[] fromJunction, int[] toJunction, int[] ductLength) {
		int duration = 0;

		for (int i = 0; i < fromJunction.length; i++) {
			if(fromJunction[i] == start) {
				duration = Math.max(duration, ductLength[i] + GetBiggestTimeSpanFrom(toJunction[i], fromJunction, toJunction, ductLength));
			}
		}

		return duration;
	}
}
