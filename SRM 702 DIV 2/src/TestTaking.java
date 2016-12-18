import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class TestTaking {
	
	public int findMax(int questions, int guessed, int actual) {
		if(guessed >= actual) {
			return questions - guessed + actual;
		}
		return questions - actual + guessed;
	}
}
