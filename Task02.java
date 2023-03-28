import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * Реализовать алгоритм пирамидальной сортировки (HeapSort)
 */
public class Task02 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Сколько элементов хотите ввести? ");
        int sizeArr = input.nextInt();

        int[] myArray = new int[] { 8, 3, 2, 7, 12, -9, 1, 4 };
        if (sizeArr % 2 != 0)
            sizeArr++;

        

        for (int j = 0; j < myArray.length; j++) {

            for (int i = (myArray.length - 1) / 2; i >= 0; i--) {
                LargestFromHeap(myArray, i);
            }
            if (myArray[0] != -2147483648) {
                System.out.printf("%d" + " ", myArray[0]);
            }
            myArray[0] = -2_147_483_648;
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