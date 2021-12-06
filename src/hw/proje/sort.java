package hw.proje;

public class sort {
    public static void main(String[] args) {
        int[] array = new int[] { 66, 44, 55, 33, 22, 11, 77, 88, 111, 222, 333, 444, 999, 555, 99};
        printArray(array);
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    isSorted = false;
                }
            }
            printArray(array);
        }
    }

    private static void printArray(int[] arr) {
        System.out.print(" | ");
        for (int i = 0; i < arr.length; i++)  {
            if (i > 0) {
                System.out.print(", ");

            }
            System.out.print(arr[i]);
        }
    }
}
