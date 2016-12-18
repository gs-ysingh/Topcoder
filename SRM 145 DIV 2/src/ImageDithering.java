import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class ImageDithering {
	
	public int count(String dithered, String[] screen) {
		int count = 0;
		for(String str : screen) {
			for (int i = 0; i < dithered.length(); i++) {
				count += countOccurrences(str, dithered.charAt(i));
			}
		}
		return count;
	}

	public static int countOccurrences(String haystack, char needle) {
		int count = 0;
		for (int i = 0; i < haystack.length(); i++) {
			if (haystack.charAt(i) == needle)
			{
				count++;
			}
		}
		return count;
	}
}
