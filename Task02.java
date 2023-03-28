import java.util.Scanner;

/**
 * Реализовать алгоритм пирамидальной сортировки (HeapSort)
 */
public class Task02 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] myArray = MakeArray(input);
        input.close();

        System.out.println("Отсортированный массив: ");

        for (int j = 0; j < myArray.length; j++) {

            for (int i = (myArray.length - 2) / 2; i >= 0; i--) {
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

    public static int[] MakeArray(Scanner input) {
        System.out.println("Сколько элементов хотите ввести? ");
        int sizeArray = input.nextInt();
        if (sizeArray % 2 == 0) {
            int[] madeArray = new int[sizeArray];
            for (int i = 0; i < madeArray.length; i++) {
                System.out.printf("Введите элемент %d: ", i + 1);
                madeArray[i] = input.nextInt();
            }
            return madeArray;
        } else {
            int[] madeArray = new int[sizeArray + 1];
            madeArray[sizeArray] = -2_147_483_648;
            for (int i = 0; i < madeArray.length - 1; i++) {
                System.out.printf("Введите элемент %d: ", i + 1);
                madeArray[i] = input.nextInt();
            }
            return madeArray;
        }
    }
}