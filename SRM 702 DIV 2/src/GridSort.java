import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class GridSort {
	
	public String sort(int n, int m, int[] grid) {
		String res = "Possible";
		int [][] values = new int[n][m];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				values[i][j] = grid[i* m + j];
			}
		}

		int flag = 1;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < m; j++) {
				if(j == 0) {
					if(values[i][j] > values[i + 1][j]) {
						flag = 1;
					}
					else {
						flag = 0;
					}
				}
				else {
					if((flag == 0 && values[i][j] > values[i + 1][j])
							|| (flag == 1 && values[i][j] < values[i + 1][j])) {
						res = "Impossible";
						break;
					}
				}
			}
			if(res == "Impossible") {
				break;
			}
		}

		for (int i = 0; i < m - 1; i++) {
			for (int j = 0; j < n; j++) {
				if(j == 0) {
					if(values[j][i] > values[j][i + 1]) {
						flag = 1;
					}
					else {
						flag = 0;
					}
				}
				else {
					if((values[j][i] > values[j][i + 1] && flag == 0)
							|| (values[j][i] < values[j][i + 1] && flag == 1)) {
						res = "Impossible";
						break;
					}
				}
			}

			if(res == "Impossible") {
				break;
			}
			
		}

		return res;
	}
}
