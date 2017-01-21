import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class SuperUserDo {
	
	public int install(int[] A, int[] B) {
	    int len = A.length;
        ArrayList<Integer> arr = new ArrayList();
        for (int i = 0; i < len; i++) {
            for(int j = A[i]; j <= B[i]; j++) {
                if(arr.indexOf(j) == -1) {
                    arr.add(j);
                }
            }
        }
        return arr.size();
	}
}
