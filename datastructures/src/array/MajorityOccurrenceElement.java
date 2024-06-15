package array;

import java.util.HashMap;
import java.util.Map;

public class MajorityOccurrenceElement {
    public static void main(String[] args) {
        int[] arr = {3,1,3,3,2};
        int[] arr1 = {2, 2, 1, 1, 1, 2, 2};
        System.out.println(findMajorityElementByBMV(arr));
        System.out.println(findMajorityElementByBMV(arr1));
        System.out.println(findMajorityElementByMap(arr));
        System.out.println(findMajorityElementByMap(arr1));
    }

    private static int findMajorityElementByMap(int[] arr) {
        HashMap<Integer,Integer> countMap = new HashMap<>();
        int majorityCount = arr.length/2;
        for (int num : arr){
            countMap.put(num, countMap.getOrDefault(num,0)+1);
        }
        for (Map.Entry<Integer,Integer> entry : countMap.entrySet()){
            if (entry.getValue()>majorityCount){
                return entry.getKey();
            }
        }
        return -1;
    }

    //Boyer-Moore Voting Algorithm
    private static int findMajorityElementByBMV(int arr[]) {
        int candidate = findCandidate(arr);
        if(isMajorityCandidate(candidate,arr)){
            return candidate;
        }
        else {
            return -1;
        }
    }

    private static boolean isMajorityCandidate(int candidate, int[] arr) {
        int count = 0;
        for (int num : arr) {
            if(num == candidate) {
                count++;
            }
        }
        return count>arr.length/2;
    }

    private static int findCandidate(int[] arr) {
        int count = 0;
        int candidate = -1;
        for(int num : arr) {
            if(count==0) {
                candidate=num;
            }
            if(num==candidate) {
                count++;
            }
            else {
                count--;
            }
        }
        return candidate;
    }
}
