package array;

public class LeftOccurrence {
    public static void main(String[] args) {
    }

    static int leftIndex(int N, int arr[], int X) {

        int low = 0;
        int high = arr.length - 1;
        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == X) {
                result = mid; // Update result to current mid
                high = mid - 1; // Move to the left half to find the leftmost occurrence
            } else if (arr[mid] < X) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return result;
    }

    private static int leftIndexIterative(int N, int arr[], int X) {
        int low = 0;
        int high = N - 1;
        while (low <= high) {
            int mid = (low + (high - low)) / 2;
            if (arr[mid] > X) {
                high = mid - 1;
            } else if (arr[mid] < X) {
                low = mid + 1;
            } else {
                if (mid == 0 || arr[mid - 1] != arr[mid]) {
                    return mid;
                } else {
                    high = high - 1;
                }
            }
        }
        return -1;
    }

    static int leftIndexRecursive(int arr[], int low, int high, int X) {
        int mid = (low + (high - low)) / 2;
        if (low > high) {
            return -1;
        }
        if (arr[mid] > X) {
            return leftIndexRecursive(arr, low, mid - 1, X);
        } else if (arr[mid] < X) {
            return leftIndexRecursive(arr, mid + 1, high, X);
        } else {
            if (mid == 0 || arr[mid - 1] != arr[mid]) {
                return mid;
            } else {
                return leftIndexRecursive(arr, low, mid - 1, X);
            }
        }
    }
}
