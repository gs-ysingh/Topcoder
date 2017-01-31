import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class StepsConstruct {
	
	public String construct(String[] board, int k) {
		String res = "";
		int row = board.length;
		int col = board[0].split("").length;

		String[][] arr = new String[row][col];

		for (int i = 0; i < board.length; i++) {
			String[] rows = board[i].split("");
			for (int j = 0; j < rows.length; j++) {
				arr[i][j] = rows[j];
			}
		}

		int m = k;
		ArrayList<String> result = new ArrayList<>();

		if(arr[0][0].equals("#")) {
			return "";
		}

		isLastIndexWithKSum(arr, 0, 0, m, row, col, result);
		String out = "";

		for(String str : result) {
			out += str;
		}

		return out;
	}

	private ArrayList<String> isLastIndexWithKSum(String[][] arr, int i, int j, int m, int row, int col, ArrayList<String> result) {
		arr[i][j] = "#";
		if(m < 0) {
			result.remove(result.size() - 1);
			return result;
		}

		if(i == row - 1 && j == col - 1 && m == 0) {
			return result;
		}
		if(i > 0 && arr[i - 1][j].equals(".")) {
			result.add("U");
			return isLastIndexWithKSum(arr, i - 1, j, m - 1, row, col, result);
		}
		if(i < row - 1 && arr[i + 1][j].equals(".")) {
			result.add("D");
			return isLastIndexWithKSum(arr, i + 1, j, m - 1, row, col, result);
		}
		if(j > 0 && arr[i][j - 1].equals(".")) {
			result.add("L");
			return isLastIndexWithKSum(arr, i, j - 1, m - 1, row, col, result);
		}
		if(j < col - 1 && arr[i][j + 1].equals(".")) {
			result.add("R");
			return isLastIndexWithKSum(arr, i, j + 1, m - 1, row, col, result);
		}

		return result;
	}
}
