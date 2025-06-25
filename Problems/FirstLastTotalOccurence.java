public class FirstLastTotalOccurence {

    public static int findFirstOccurrence(int[] arr, int key) {
        int res = -1;
        int start = 0, end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == key) {
                res = mid;
                end = mid - 1;
            } else if (arr[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return res;
    }

    public static int findLastOccurrence(int[] arr, int key) {
        int res = -1;
        int start = 0, end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == key) {
                res = mid;
                start = mid + 1;
            } else if (arr[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return res;
    }

    public static int totalOccurrences(int[] arr, int key) {
        int first = findFirstOccurrence(arr, key);
        int last = findLastOccurrence(arr, key);

        if (first == -1 || last == -1) {
            return 0;
        }

        return last - first + 1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 2, 3, 3, 3, 3, 5, 8, 8, 8, 9, 9, 9, 9, 55};
        int value = 3;

        int first = findFirstOccurrence(arr, value);
        int last = findLastOccurrence(arr, value);
        int total = totalOccurrences(arr, value);

        System.out.println("First Occurrence at index: " + first);
        System.out.println("Last Occurrence at index: " + last);
        System.out.println("Total Occurrences: " + total);
    }
}
