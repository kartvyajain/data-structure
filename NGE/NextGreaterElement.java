public class NextGreaterElement {
    public static int nextGreaterElementSearch(int arr[], int l, int target) {
        int low = 0;
        int high = l - 1;
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                
                if (mid < l - 1 && arr[mid + 1] == target) {
                    low = mid + 1;
                } else {
                    ans = mid + 1;
                    break;
                }
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                ans = mid; 
                high = mid - 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {5, 7, 18, 18, 18, 20, 25};
        int n = arr.length;
        int target = 19;
        int index = nextGreaterElementSearch(arr, n, target);

        if (index != -1 && index < n) {
            System.out.println("Next greater element found at index " + index + ": " + arr[index]);
        } else {
            System.out.println("Next greater element not found");
        }
    }
}
