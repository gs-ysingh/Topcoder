import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class Cross {
	
	public String exist(String[] board) {
		String res = "Does not exist";
		int row = board.length;
		int col = board[0].split("").length;

		String[][] arr = new String[row][col];
		for (int i = 0; i < board.length; i++) {
			String[] rows = board[i].split("");
			for (int j = 0; j < rows.length; j++) {
				arr[i][j] = rows[j];
			}
		}



		for (int i = 1; i < row - 1; i++) {
			res = "Does not exist";
			for (int j = 1; j < col - 1; j++) {
				if(arr[i][j].equals("#")
						&& arr[i][j].equals(arr[i + 1][j])
						&& arr[i + 1][j].equals(arr[i - 1][j])
						&& arr[i - 1][j].equals(arr[i][j - 1])
						&& arr[i][j - 1].equals(arr[i][j + 1])) {
					res = "Exist";
					break;
				}
			}
			if(res.equals("Exist")) {
				break;
			}
		}
		return res;
	}

}
