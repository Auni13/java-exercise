public class MultiArray{
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6, 7},
            {8, 9}
        };

        //Length of array
        System.out.println("Length of the array: " + matrix.length);

        //Length of sub-array
        System.out.println("Length of sub array: ");
        for(int row=0; row<matrix.length; row++){
            System.out.println(matrix[row].length);
        }

        //Element in array
        System.out.println("Element in the array : ");
        for (int row = 0; row<matrix.length; row++){
            for(int col = 0; col<matrix[row].length; col++){
                System.out.println(matrix[row][col]);
            }
        }
    }
}