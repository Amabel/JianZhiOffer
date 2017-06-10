package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import solution.NumberOf1;

/**
 * @author  Weibin Luo
 * @version Created on 2017/06/05 22:35:36
 */
public class TestNumberOf1 {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testCountNumberOfOne1() {
//		fail("Not yet implemented");
	}

	@Test
	public void testCountNumberOfOne2() {
		int n1 = 7; // 0111
		assertEquals(3, NumberOf1.countNumberOfOne2(n1));
		
		int n2 = 0; // 0000
		assertEquals(0, NumberOf1.countNumberOfOne2(n2));
		
		int n3 = 2147483647; // 0111 1111 ... 1111  32bit
		assertEquals(31, NumberOf1.countNumberOfOne2(n3));
		
		int n4 = -1;
		assertEquals(32, NumberOf1.countNumberOfOne2(n4));
		
	}

}
