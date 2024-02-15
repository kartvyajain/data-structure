public class lastindex {
    public static int lastIndexSearch(int arr[], int l, int target) {
        int low = 0;
        int high = l - 1;
       

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                if(mid < l && arr[mid+1] == target)
               { 
                low = mid + 1; }
                else 
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
        int[] arr = {5, 7, 18, 18, 18, 19, 25};
        int n = arr.length;
        int target = 18;
        int index = lastIndexSearch(arr, n, target);

        if (index != -1) {
            System.out.println("Element found at index " + index);
        } else {
            System.out.println("Element not found");
        }
    }
}
