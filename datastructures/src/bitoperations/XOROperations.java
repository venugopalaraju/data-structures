package bitoperations;

public class XOROperations {
    public static void main(String[] args) {
        int[] arr=new int[]{1,2,3,5,1,2,3};
        System.out.println(findUnique(arr));

    }
    public static int findUnique(int[] arr){
        int unique = 0;
        for (int i:arr){
            unique^=i;
        }
        return unique;
    }
}
