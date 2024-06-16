package array;

public class RotateMatrixAntiClockWiseBy90 {
    public static void main(String[] args) {
        int[][] array = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        PrintArray.printArray(array);
        System.out.println();
        //PrintArray.printArray(rotateMatrixAntiClockWiseBy90(array));
        PrintArray.printArray(rotateMatrixAntiClockWiseBy90WithTransposeApproach(array));
    }

    private static int[][] rotateMatrixAntiClockWiseBy90WithTransposeApproach(int[][] array) {
        TransposeOfMatrix.transposeOfMatrixUsingSwap(array);
        for (int i=0;i< array.length;i++){
            int low = 0;
            int high = array.length-1;
            while (low<high){
                int temp = array[low][i];
                array[low][i] = array[high][i];
                array[high][i] = temp;
                low++;
                high--;
            }
        }
        return array;
    }

    private static int[][] rotateMatrixAntiClockWiseBy90(int[][] array) {
        int[][] temp = new int[array.length][array.length];
        for (int i=0;i<array.length;i++){
            for (int j=0;j<array.length;j++){
                temp[array.length-j-1][i] = array[i][j];
                //0,0 = 0,3-4  0,1 = 8
                //1,0 = 0,2-3  1,1 = 7
                //2,0 = 0,1-2  2,1 = 6
                //3,0 = 0,0-1  3,1 = 5
            }
        }
        return temp;
    }
}
