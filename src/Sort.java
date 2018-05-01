public class Sort {
    int[] array;
    int size;

    public Sort(int array[], int size) {
        this.array = array;
        this.size = size;
    }

    public void bubbleSort() {
        for (int i = size - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    Util.swapValues(j, j + 1);
                }
            }
        }
    }

    public void selectionSort() {
        int maximum;
        for (int i = 0; i < size; i++) {
            maximum = i;
            for (int j = i; j < size; j++) {
                if (array[maximum] < array[j]) {
                    maximum = j;
                }
            }
            Util.swapValues(i, maximum);
        }
    }

    public void insertionSort() {
        for (int i = 1; i < size; i++) {
            int j = i;
            int toInsert = array[i];
            while (j > 0 && array[j - 1] > toInsert) {
                array[j] = array[j - 1];
                j--;
            }

//            System.out.println("array[j]: " + array[j] + " toInsert:  " + toInsert + "  i: " + i + "  j: " + j);
            array[j] = toInsert;
        }


    }

}
