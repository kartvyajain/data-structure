public class  binary{
    public static int binary_search(int arr[], int l, int target) {
        int low = 0;
        int high = l - 1;
    
        while (low <= high) {
            int mid = low + (high - low) / 2;
    
            if (arr[mid] == target) {
                return mid; 
            } else if (arr[mid] < target) {
                low = mid + 1; 
            } else {
                high = mid - 1; 
            }
        }
    
        return -1; 
    }
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        int n = arr.length;
        int target = 13;
        int index = binary_search(arr, n, target);

        if (index != -1) {
            System.out.println("Element found at index " + index);
        } else {
            System.out.println("Element not found");
        }
    }
}