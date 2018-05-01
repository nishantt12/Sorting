public class ArrayStructure {
    int[] array;
    int size;

    public ArrayStructure(int array[], int size) {
        this.array = array;
        this.size = size;
    }

    public void deleteItemAtIndex(int index) {
        if (index >= size)
            return;
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        Util.decrementSize();
    }
}
