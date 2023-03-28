import java.util.ArrayList;

/**
 * Реализовать алгоритм пирамидальной сортировки (HeapSort)
 */
public class Task02 {

    public static void main(String[] args) {

        int[] myArray = new int[] { 8, 3, 2, 7, -9, 1, 4 };

        for (int j = myArray.length - 1; j >= 0; j--) {
            // int oops = 0;
            for (int i = (myArray.length / 2 - 1); i >= 0; i--) {
                LargestFromHeap(myArray, i);
            }

            // System.out.printf("%d" + " ", myArray[0]);
            // oops++;
            // myArray[0]=-1;
            // int temp = myArray[myArray.length - 1];
            // myArray[myArray.length - 1] = myArray[0];
            // myArray[0] = temp;

        }
        // System.out.println(myArray.toString());
        System.out.println();
        ArrayList<Integer> myList=new ArrayList<>();
        
        for (int i : myArray) {
            System.out.print(i + " ");
        }
    }

    public static void LargestFromHeap(int[] array, int i) {
        int temp = 0;

        if (array[2 * i] >= array[2 * i + 1]) {

            if (array[i] < array[2 * i]) {
                temp = array[i];
                array[i] = array[2 * i];
                array[2 * i] = temp;
            }
        } else if (array[2 * i + 1] >= array[2 * i]) {
            if (array[i] < array[2 * i + 1]) {
                temp = array[i];
                array[i] = array[2 * i + 1];
                array[2 * i + 1] = temp;
            }
        }
    }
}