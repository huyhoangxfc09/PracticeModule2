package InsertionSort;

public class InsertionSort {
    static int[]array = { 5,6,9,8,5,8,9,12,25,41,6,1,8,5,2};
    public static void insertionSort(int[]array){
        int pos, tempt;
        for(int i = 1; i < array.length; i++){
            tempt = array[i];
            pos = i;
            while(pos > 0 && tempt < array[pos-1]){
                array[pos] = array[pos-1];
                pos--;
            }
            array[pos] = tempt;
        }
    }

    public static void main(String[] args) {
        insertionSort(array);
        for (int element:array){
            System.out.print(element+"\t");
        }
    }
}
