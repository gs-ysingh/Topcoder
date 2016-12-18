import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class Time {
	
	public String whatTime(int seconds) {
		return Integer.toString(seconds / 3600) + ":" + Integer.toString((seconds / 60) % 60) + ":" + Integer.toString(seconds % 60);
	}
}
