public class SelectionSort {
    public static double[] list = {1, 9, 4.5, 6.6, 5.7, -4.5};

    public static void selectionSort(double[] list) {
        int length = list.length;
        double temp;
        for (int i = 0; i < length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < length; j++) {
                if (list[j] < list[min]) {
                    min = j;
                }
            }
            temp = list[min];
            list[min] = list[i];
            list[i] = temp;
        }
    }

    public static void main(String[] args) {
        System.out.println("Before: ");
        for (double elements : list) {
            System.out.print(elements + "\t");
        }
        System.out.println("\nAfter: ");
        selectionSort(list);
        for (double elements : list) {
            System.out.print(elements + "\t");
        }
    }
}