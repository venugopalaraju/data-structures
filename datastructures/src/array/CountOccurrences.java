package array;

public class CountOccurrences {
    public static void main(String[] args) {
        System.out.println(countOccurrences(new int[]{1,2,3,3,3,5},3));
    }

    private static int countOccurrences(int[] arr,int x) {
        int count = -1;
        for (int i : arr){
            if (arr[i]==x){
                count++;
            }
        }
        return count;
    }
}
