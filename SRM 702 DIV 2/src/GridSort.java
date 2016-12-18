import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class GridSort {
	
	public String sort(int n, int m, int[] grid) {
		int flag = 0;

		for (int i = 0; i < n - 1; i++) {
			flag = 0;
			for (int j = 0; j < m; j++) {
				if(j == 0) {
					if(grid[i*m + j] > grid[i*m + j + m]) {
						flag = 1;
					}
				}
				else {
					if(grid[i*m + j] < grid[i*m + j + m] && flag == 1
							|| grid[i*m + j] > grid[i*m + j + m] && flag == 0) {
						return "Impossible";
					}
				}
			}
		}

		for (int i = 0; i < m - 1; i++) {
			flag = 0;
			for (int j = 0; j < n; j++) {
				if(j == 0) {
					if(grid[j*m + i] > grid[j*m + i + 1]) {
						flag = 1;
					}
				}
				else {
					if(grid[j*m + i] < grid[j*m + i + 1] && flag == 1
							|| grid[j*m + i] > grid[j*m + i + 1] && flag == 0) {
						return "Impossible";
					}
				}
			}
		}
		return "Possible";
	}
}
