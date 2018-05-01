public class Util {
    private static int size = 9;
    private static int[] array = new int[50];
    private static int times;

    public static int[] generateRandomArray() {
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * 10) + 10;
        }
        array = new int[]{8, -4, 2, -9, 23, 83, 1, 3, 7};
        return array;
    }

    public static void binarySearch(int value, int start, int end) {

        int index = (start + end) / 2;
        System.out.println("times: " + times++ +  " index: "+ index);
        if (value == array[index]) {
            System.out.println(value + " found  at " + index);
        } else if (value > array[index]) {
            binarySearch(value, index, end);
        } else {
            binarySearch(value, start, index);
        }

    }

    public static boolean isValueExists() {
        return false;
    }

    public static void printArray(int array[]) {
        System.out.println("-----------");
        for (int i = 0; i < size; i++) {
            System.out.print("| " + i + " | ");
            System.out.println(array[i] + " | ");
            System.out.println("-----------");
        }
    }


    public static int getSize() {
        return size;
    }

    public static void setSize(int size) {
        Util.size = size;
    }

    public static void incrementSize() {
        size++;
    }

    public static void decrementSize() {
        size--;
    }

    public static void swapValues(int indexOne, int indexTwo) {
        int temp = array[indexOne];
        array[indexOne] = array[indexTwo];
        array[indexTwo] = temp;
    }


}
