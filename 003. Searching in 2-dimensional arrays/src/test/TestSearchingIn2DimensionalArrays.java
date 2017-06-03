package test;


import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import solution.SearchingIn2DimensionalArrays;

/**
 * @author  Weibin Luo
 * @version Created on 2017/06/02 15:58:52
 */
public class TestSearchingIn2DimensionalArrays {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testFind() {
// 		the 2D arrays
//		 1  2  8  9
//       2  4  9  12
//       4  7  10 13
//       6  8  11 15
		assertTrue(SearchingIn2DimensionalArrays.find(SearchingIn2DimensionalArrays.array, 1));
		assertTrue(SearchingIn2DimensionalArrays.find(SearchingIn2DimensionalArrays.array, 9));
		assertTrue(SearchingIn2DimensionalArrays.find(SearchingIn2DimensionalArrays.array, 7));
		assertTrue(SearchingIn2DimensionalArrays.find(SearchingIn2DimensionalArrays.array, 6));
		assertTrue(SearchingIn2DimensionalArrays.find(SearchingIn2DimensionalArrays.array, 15));
		assertTrue(SearchingIn2DimensionalArrays.find(SearchingIn2DimensionalArrays.array, 10));
		
		assertFalse(SearchingIn2DimensionalArrays.find(SearchingIn2DimensionalArrays.array, 0));
		assertFalse(SearchingIn2DimensionalArrays.find(SearchingIn2DimensionalArrays.array, -1));
		assertFalse(SearchingIn2DimensionalArrays.find(SearchingIn2DimensionalArrays.array, 2147483647));
		assertFalse(SearchingIn2DimensionalArrays.find(SearchingIn2DimensionalArrays.array, -100000000));
		assertFalse(SearchingIn2DimensionalArrays.find(SearchingIn2DimensionalArrays.array, 3));
		assertFalse(SearchingIn2DimensionalArrays.find(SearchingIn2DimensionalArrays.array, 5));
	}

}
