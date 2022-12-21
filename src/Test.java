
public class Test {
    public static void main(String[] args) {
        int[] array = {5, 2, 3, 6, 9, 8, 7, 1, 4, 0};
        selectionSort(array);
        for (int element : array) {
            System.out.print(element+" ");
        }
    }

    public static void selectionSort(int[] array) {
        int indexMin;
        for (int i = 0; i < array.length; i++) {
            indexMin = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[indexMin]) {
                    indexMin = j;
                }
                if (indexMin != i) {
                    int tempt = array[indexMin];
                    array[indexMin] = array[i];
                    array[i] = tempt;
                }
            }
        }
    }
}
