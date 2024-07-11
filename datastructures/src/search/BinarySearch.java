package search;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(findElement(arr,1));
        System.out.println(findElement(arr,9));
        System.out.println(findElement(arr,10));
        System.out.println(findElement(arr,0));
        System.out.println(findElement(arr,-1));
        System.out.println(findElement(arr,5));
        System.out.println(findElement(arr,3));
        System.out.println(findElement(arr,7));

        System.out.println(findElementUsingRecursive(arr,7,0, arr.length-1));
        System.out.println(findElementUsingRecursive(arr,9,0, arr.length-1));
        System.out.println(findElementUsingRecursive(arr,10,0, arr.length-1));
        System.out.println(findElementUsingRecursive(arr,0,0, arr.length-1));
        System.out.println(findElementUsingRecursive(arr,1,0, arr.length-1));
        System.out.println(findElementUsingRecursive(arr,3,0, arr.length-1));

    }

    private static boolean findElementUsingRecursive(int[] arr, int i, int low, int high) {
        while (low <= high){
            int mid = (low+high)/2;
            if (arr[mid] == i){
                return true;
            } else if (arr[mid] > i) {
                return findElementUsingRecursive(arr,i,low,mid-1);
            } else if (arr[mid] < i) {
                return findElementUsingRecursive(arr,i,mid+1,high);
            }
        }
        return false;
    }

    private static boolean findElement(int[] arr, int i) {
        int low = 0;
        int high = arr.length-1;
        while (low<=high) {
            int mid = (low+high)/2;
            if(arr[mid] == i) {
                return true;
            } else if (arr[mid] > i) {
                high = mid-1;
            } else if (arr[mid] < i) {
                low = mid+1;
            }
        }
        return false;
    }
}
