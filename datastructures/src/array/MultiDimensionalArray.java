package array;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        int[][] mdArray= {{1,2,3},{4,5,6}};
        multiDimensionalArray(mdArray);
        System.out.println();
        int[][] jArray = new int[4][];
        jaggedArray(jArray);
    }

    private static void multiDimensionalArray(int[][] mdArray) {
        for (int i = 0; i< mdArray.length; i++){
            for (int j = 0; j< mdArray[i].length; j++){
                System.out.print(mdArray[i][j]+" ");
            }
        }
    }

    private static void jaggedArray(int[][] jArray) {
        for (int i = 0; i< jArray.length; i++){
            jArray[i] = new int[i+1];
            for(int j = 0; j< jArray[i].length; j++){
                jArray[i][j] = i;
                System.out.print(jArray[i][j]+" ");
            }
            System.out.println();
        }
    }
}
