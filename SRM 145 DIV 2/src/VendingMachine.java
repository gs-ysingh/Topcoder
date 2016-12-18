import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class VendingMachine {
	
	public int motorUse(String[] prices, String[] purchases) {
		int row = prices.length;
		int[][] price = new int[row][];
		int col = 0;

		for (int i = 0; i < row; i++) {
			String[] str = prices[i].split(" ");
			col = str.length;
			price[i] = new int[col];
			for (int j = 0; j < col; j++) {
				price[i][j] = Integer.parseInt(str[j]);
			}
		}

		int count = 0;
		int index = 0;
		int maxIndex = 0;
		int prevTime = 0;

		for (int i = 0; i < purchases.length; i++) {
			int r = Integer.parseInt(purchases[i].split(",")[0]);
			int c = Integer.parseInt(purchases[i].split(",")[1].split(":")[0]);

			int time = Integer.parseInt(purchases[i].split(":")[1]) - prevTime;
			prevTime = Integer.parseInt(purchases[i].split(":")[1]);

			if(price[r][c] == 0) {
				return -1;
			}

			if(time >= 5 || i == 0) {
				maxIndex =  getColumnOfMaxValue(price, row, col);
				count += getRotation(index, maxIndex, col);
				index = maxIndex;
			}
			count += getRotation(index, c, col);
			index = c;
			price[r][c] = 0;
		}

		//reset 2:
		maxIndex =  getColumnOfMaxValue(price, row, col);
		if(maxIndex != index) {
			count += getRotation(index, maxIndex, col);
		}
		index = maxIndex;

		return count;
	}

	private int getRotation(int index, int maxIndex, int col) {
		return Math.min(Math.abs(index - maxIndex), col - Math.abs(index - maxIndex));
	}

	private int getColumnOfMaxValue(int[][] price, int row, int col) {
		int max = Integer.MIN_VALUE;
		int colIndex = 0;
		for (int j = 0; j < col; j++) {
			if(price[row - 1][j] > max) {
				max = price[row - 1][j];
				colIndex = j;
			}
		}
		return colIndex;
	}
}
