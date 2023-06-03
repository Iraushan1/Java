package String;

public class FintSubString {

	public static String findCommanString(String[] arr) {
		int len = arr[0].length(), temp = 0;

		// Finding smallest word in string array
		for (String s : arr) {
			temp = s.length();
			if (temp < len) {
				len = temp;
			}
		}
		System.out.println(len);
		String s = "";
		int i = 0, j = 0, flag = 0;

		for (String s1 : arr) {
			char c1 = s1.charAt(i);
			flag = 0;
			j = 0;
			for (String s2 : arr) {
				char c2 = s2.charAt(i);
				if (c1 != c2) {
					flag = 1;
					 break;
				}
				/*
				 * if (j < len) j++; else break;
				 */
			}
			if (flag == 0)
				s += c1;
			if (i < len)
				i++;
			else
				break;
		}
		return s;
	}
	public static void main(String[] args) {
		String s[]= {"raushan","raushan","rau","raumsha","rakks"};
		System.out.println(FintSubString.findCommanString(s));		

	}

}
