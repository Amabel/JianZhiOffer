package test;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import solution.ReplaceTheSpace;

/**
 * @author  Weibin Luo
 * @version Created on 2017/06/03 18:21:59
 */
public class TesReplaceTheSpace {

	@Before
	public void setUp() throws Exception {
	}

	@Test (expected = IllegalArgumentException.class)
	public void testReplace() {
		String str1 = "we are happy";
		String res1 = "we%20are%20happy\0";
		assertArrayEquals(res1.toCharArray(), ReplaceTheSpace.replace(str1.toCharArray()));
		
		String str2 = "wee   ee   eee    eeee ";
		String res2 = "wee%20%20%20ee%20%20%20eee%20%20%20%20eeee%20\0";
		assertArrayEquals(res2.toCharArray(), ReplaceTheSpace.replace(str2.toCharArray()));
//		
		String str3 = "  weee  ";
		String res3 = "%20%20weee%20%20\0";
		assertArrayEquals(res3.toCharArray(), ReplaceTheSpace.replace(str3.toCharArray()));
		
		String str4 = "    ";
		String res4 = "%20%20%20%20\0";
		assertArrayEquals(res4.toCharArray(), ReplaceTheSpace.replace(str4.toCharArray()));
		
		String str5 = "";
		String res5 = "\0";
		assertArrayEquals(res5.toCharArray(), ReplaceTheSpace.replace(str5.toCharArray()));
		
		String str6 = " ";
		String res6 = "%20\0";
		assertArrayEquals(res6.toCharArray(), ReplaceTheSpace.replace(str6.toCharArray()));
		
		char[] str7 = null;
		ReplaceTheSpace.replace(str7);
		
	}

}
