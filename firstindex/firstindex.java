public class  firstindex{
    public static int firstindex_search(int arr[], int l, int target) {
        int low = 0;
        int high = l - 1;
        //int i=0;
    
        while (low <= high) {
           // int mid = i+low + (high - low) / 2;
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
               if( mid>0 && arr[mid-1]==target) {
                return firstindex_search( arr,  mid,  target);
                // i+=-1;
                // continue;
               }
               else 
               {
                return mid;
               }
            } else if (arr[mid] < target) {
                low = mid + 1; 
            } else {
                high = mid - 1; 
            }
        }
    
        return -1; 
    }
    public static void main(String[] args) {
        int[] arr = {5,7,18,18,18,19,25};
        int n = arr.length;
        int target = 18;
        int index = firstindex_search(arr, n, target);

        if (index != -1) {
            System.out.println("Element found at index " + index);
        } else {
            System.out.println("Element not found");
        }
    }
}