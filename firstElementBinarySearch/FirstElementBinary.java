class FirstElementBinary {

    public static int firstElementBinarySearch(int arr[], int l) {
        int low = 0;
        int high = l - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if ((mid == 0 || arr[mid] != arr[mid - 1]) && (mid == l - 1 || arr[mid] != arr[mid + 1])) {
                return mid;
            } else if (mid > 0 && arr[mid] == arr[mid - 1]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {0, 2, 2, 3, 3, 4, 4, 5}; 
        int n = arr.length;

        int index = firstElementBinarySearch(arr, n);

        if (index != -1) {
            System.out.println("First non-duplicated element found at index " + index + ", value: " + arr[index]);
        } else {
            System.out.println("No non-duplicated element found");
        }
    }
}
