package array;

public class TransposeOfMatrix {
    public static void main(String[] args) {
        int[][] array = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        PrintArray.printArray(array);
        System.out.println();
        PrintArray.printArray(transposeOfMatrixUsingSwap(array));
    }

    public static int[][] transposeOfMatrixUsingSwap(int[][] array) {
        for (int i=0;i<array.length;i++) {
            for (int j=i+1;j<array.length;j++){
                int temp = array[j][i];
                array[j][i] = array[i][j];
                array[i][j] = temp;
            }
        }
        return array;
    }

    private static int[][] transposeOfMatrix(int[][] array) {
        int[][] temp = new int[array.length][];
        for (int i=0;i<array.length;i++) {
            temp[i] = new int[array[i].length];
            for (int j=0;j<array[i].length;j++){
                temp[i][j] = array[j][i];
            }
        }
        for (int i=0;i< temp.length;i++){
            for (int j=0;j<temp[i].length;j++){
                array[i][j] = temp[i][j];
            }
        }
        return array;
    }
}
