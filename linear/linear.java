public class linear {
    
    public static int linear_search(int key, int[] arr) {
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            if (key == arr[i]) {
                return i; 
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        int[] myArray = {10, 20, 30, 40, 50};
        int key = 30;
        int result = linear_search(key, myArray);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }
}
