public class BubbleSort {

    void bubbleSort(int array[]) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {

                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    void printArray(int array[]) {
        int n = array.length;
        for (int i = 0; i < n; ++i)
            System.out.println(array[i] + "");
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        BubbleSort bs = new BubbleSort();
        int array[] = { 64, 34, 25, 12, 22, 11, 90 };
        bs.bubbleSort(array);
        System.out.println("sorted array:");
        bs.printArray(array);
    }
}
