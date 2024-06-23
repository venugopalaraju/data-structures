package array;

public class SpiralTraversalOfMatrix {
    public static void main(String[] args) {
        int[][] array = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        PrintArray.printArray(spiralMatrixOfArray(array));
    }

    private static int[][] spiralMatrixOfArray(int[][] array) {
        int top=0,right= array.length-1,bottom= array.length-1,left= 0;
        return array;
    }
}
