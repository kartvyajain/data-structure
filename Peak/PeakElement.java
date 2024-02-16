 class PeakElement {
    int findPeak(int[] arr) {
        int l = arr.length;
        for (int i = 0; i < l; i++) {
            if (i == 0 && l > 1 && arr[i] > arr[i + 1]) {
                return i;
            } else if (i == l - 1 && l > 1 && arr[i] > arr[i - 1]) {
                return i;
            } else if (i > 0 && i < l - 1 && arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        PeakElement peakElement = new PeakElement();
        int[] arr = {1, 3, 20, 4, 1, 0};
        int peakIndex = peakElement.findPeak(arr);
        if (peakIndex != -1) {
            System.out.println("Peak element found at index: " + peakIndex + ", value: " + arr[peakIndex]);
        } else {
            System.out.println("No peak element found.");
        }
    }
}
