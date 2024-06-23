package array;

public class MatrixBoundaryTraversal {
    public static void main(String[] args) {
        int[][] array = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        PrintArray.printArray(array);
        System.out.println();
        printMatrixBoundaryElements(array);
    }

    private static void printMatrixBoundaryElements(int[][] array) {
        for (int i=0;i<array.length;i++){
            if(i == 0){
                for(int j=0;j<array[i].length;j++){
                    System.out.print(array[i][j]+" ");
                }
            }else if(i == array.length-1){
                for(int j=array[i].length-1;j>=0;j--){
                    System.out.print(array[i][j]+" ");
                }
            }
            else{
                    System.out.print(array[i][array[i].length-1]+" ");
            }
        }
        for (int i=array.length-2;i>0;i--){
            System.out.print(array[i][0]+" ");
        }
    }
}
