package array;

public class RowWiseColumnWiseSortedArray {
    public static void main(String[] args) {
        int[][] array = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        System.out.println("7 Found :: "+search(array,7));
        System.out.println("1 Found :: "+search(array,1));
        System.out.println("10 Found :: "+search(array,10));
        System.out.println("16 Found :: "+search(array,16));
        System.out.println("-1 Found :: "+search(array,-1));
        System.out.println("18 Found :: "+search(array,18));
    }

    private static boolean search(int[][] array, int x) {
        int cIndex = array.length-1;
        int rIndex = 0;
        while (cIndex >= 0 && rIndex < array.length){
            if(array[rIndex][cIndex] == x) {
                return true;
            } else if (array[rIndex][cIndex] > x) {
                cIndex--;
            } else if (array[rIndex][cIndex] < x) {
                rIndex++;
            }
        }
        return false;
    }
}
