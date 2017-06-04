package solution;
/**
 * @author  Weibin Luo
 * @version Created on 2017/06/04 23:18:18
 */
public class NumberOf1 {

	public static void main(String[] args) {

		int n = 7;

		int count1 = countNumberOfOne1(n);
		System.out.println("countNumberOfOne1: " + n + " has " + count1 + " '1' in binary");

		int count2 = countNumberOfOne2(n);
		System.out.println("countNumberOfOne2: " + n + " has " + count2 + " '1' in binary");
	}

	// loop forever if n is negative
	public static int countNumberOfOne1(int n) {
		int count = 0;

		while (n != 0) {
			if ((n & 1) != 0) {
				count ++;
			}
			n = n >> 1;

		}
		return count;
	}

	// use variable i and shift its 1 instead of changing n's value
	public static int countNumberOfOne2(int n) {
		int count = 0;
		int i = 1;
		// the '1' in i must be shift for 64 times (in x64) until it becomes 0
		while (i != 0) {
			if ((i & n) != 0) {
				count ++;
			}
			i = i << 1;
		}
		return count;
	}
}
