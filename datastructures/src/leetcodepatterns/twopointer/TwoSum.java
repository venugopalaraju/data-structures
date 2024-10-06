package leetcodepatterns.twopointer;

//Problem: Given a sorted array of integers arr and a target sum target,
// find two numbers such that they add up to target.
public class TwoSum {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        int result[] = twoSum(arr,5);
        System.out.println(result[0]+" "+result[1]);
    }

    private static int[] twoSum(int[] arr, int target) {
        if(arr == null || arr.length<2) {
            System.out.println("invalid input array");
        }
        int[] result = new int[2];
        int left = 0; int right = arr.length-1;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if(sum == target) {
                result[0] = left;
                result[1] = right;
                break;
            } else if (sum < target) {
                left++;
            } else if (sum > target) {
                right--;
            }
        }
        return result;
    }
}
