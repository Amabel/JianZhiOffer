package solution;
public class SearchingIn2DimensionalArrays {

	public static int[][] array = {
            {1, 2, 8, 9},
            {2, 4, 9, 12},
            {4, 7, 10, 13},
            {6, 8, 11, 15}
	};
//	public static int[][] array = null;

    public static void main(String[] args) {
        int target = 2147483647;
        boolean isFound = find(array, target);

        System.out.println(target + " is found in array: " + isFound);


    }

    public static boolean find(int[][] array, int target) {
    	// check if the array is null
    	if (array == null) {
    		throw new IllegalArgumentException("array is null!");
    	}
    	// get the rows and cols of the array
    	int rows = array.length;
    	int cols = array[0].length;
    	// check if the array is empty
    	if (rows == 0 || cols == 0) {
    		throw new IllegalArgumentException("array is empty!");
    	}

    	// start from top of the right (or left of the bottom)
    	int i = 0;
    	int j = cols - 1;
    	boolean isFound = false;
    	do {
            int n = array[i][j];
            if (target == n) {
                isFound = true;
    			break;
    		} else if (target > n){
    			i ++;
    		} else {
    			j --;
    		}
    	} while (i <= rows - 1 && j >= 0);

        return isFound;
    }
}
