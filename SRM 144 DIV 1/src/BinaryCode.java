public class BinaryCode {
	
	public String[] decode(String message) {
		String [] array = message.split("");
		
		String [] case1 = new String[array.length];
		String [] case2 = new String[array.length];

		String[] res = new String [2];
		
		updateValues(case1, res, array, 0);
		updateValues(case2, res, array, 1);

		return res;
		
	}

	private void updateValues(String[] temp, String[] res, String[] array, int j) {
		if(Integer.parseInt(array[0]) > 2) {
			res[j] = "NONE";
			return;
		}

		temp[0] = String.valueOf(j);
		int len = array.length;
		for (int i = 1; i < len; i++) {
			if(i == 1) {
				temp[i] = String.valueOf(Integer.parseInt(array[i - 1]) - Integer.parseInt(temp[i - 1]));
			}
			else {
				temp[i] = String.valueOf(Integer.parseInt(array[i - 1]) - Integer.parseInt(temp[i - 1]) - Integer.parseInt(temp[i - 2]));
			}

			if(Integer.parseInt(temp[i]) > 1 || Integer.parseInt(temp[i]) < 0) {
				res[j] = "NONE";
				break;
			}
		}

		if(len > 1 && res[j] != "NONE") {
			int val = Integer.parseInt(array[len - 1])
						- Integer.parseInt(temp[len - 1])
						- Integer.parseInt(temp[len - 2]);
			if(val < 0 || val > 1) {
				res[j] = "NONE";
				return;
			}
		}

		if(res[j] != "NONE") {
			res[j] = convertToString(temp);
		}
	}

	private String convertToString(String[] strArr) {
		StringBuilder strBuilder = new StringBuilder();
		for (int i = 0; i < strArr.length; i++) {
			strBuilder.append(strArr[i]);
		}
		return strBuilder.toString();
	}
}
