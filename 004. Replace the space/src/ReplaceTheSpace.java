/**
 * @author  Weibin Luo
 * @version Created on 2017/06/02 21:05:03
 */
public class ReplaceTheSpace {

	public static void main(String[] args) {

		char[] string = {'w', 'e', ' ', 'a', 'r', 'e', ' ', 'h', 'a', 'p', 'p', 'y', '\0'};
		System.out.println(replace(string));

	}

	// replace " " with "%20" (20 is the ASCII of character space)
	public static char[] replace(char[] string) {

		int length = string.length;
		// count the number of spaces
		int numSpace = 0;
		for (int i = 0; i<length; i++) {
			if (string[i] == ' ') {
				numSpace ++;
			}
		}

		// calculate the length of new array
		int newLength = length + 2 * numSpace + 1;

		// create a new char array;
		char[] newArray = new char[newLength];

		// i for string, j for newArray
		int i = length - 1;
		int j = newLength - 1;
		newArray[j--] = '\0';
		while (i >= 0 && j >=0) {
			if (string[i] == ' ') {
				newArray[j--] = '0';
				newArray[j--] = '2';
				newArray[j] = '%';
			} else {
				newArray[j] = string[i];
			}
			i --;
			j --;
		}


		return newArray;
	}

}
