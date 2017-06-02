public class SearchingIn2DimensionalArrays {
    public static void main(String[] args) {
        int target = 7;
        int[][] array = {
                            {1, 2, 8, 9},
                            {2, 4, 9, 12},
                            {4, 7, 10, 13},
                            {6, 8, 11, 15}
                        };
        boolean isFound = new SearchingIn2DimensionalArrays().find(array, target);

        System.out.println(target + " is found in array: " + isFound);


    }

    boolean find(int[][] array, int target) {
        return false;
    }
}
