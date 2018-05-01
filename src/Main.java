public class Main {

    public static void main(String args[]) {
        int[] array = Util.generateRandomArray();
        Util.printArray(array);
//        ArrayStructure arrayStructure = new ArrayStructure(array, Util.getSize());
//        arrayStructure.deleteItemAtIndex(3);
//        Util.printArray(array);
        Sort sort = new Sort(array, Util.getSize());
//        sort.bubbleSort();
//        sort.selectionSort();
        sort.insertionSort();
        Util.printArray(array);
//        Util.binarySearch(7, 0, Util.getSize());

    }

}
