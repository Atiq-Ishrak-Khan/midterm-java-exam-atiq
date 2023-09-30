package algorithm;

import org.junit.Assert;

public class UnitTestSorting {

    /*
      This class is about Unit testing for Sorting Algorithm.
     */
    public static void main(String[] args) {
        int [] unSortedArray = {6,9,2,5,1,0,4};
        int [] sortedArray =   {0,1,2,4,5,6,9};
        //Create Sort object
        Sort sort = new Sort();
        //apply unsorted array to selectionSort.
        sort.selectionSort(unSortedArray);
        //verify if the unsorted array is sorted by the selection sort algorithm.
        try {
            Assert.assertEquals(sortedArray, unSortedArray);
        }catch(Exception ex){
            ex.getMessage();
        }

        //Now implement Unit test for rest of the soring algorithm...................below

        //selectionSort
        int[] selectionSortResult = unSortedArray.clone(); // Clone the original array
        sort.selectionSort(selectionSortResult);
        assertArrayEquals(sortedArray, selectionSortResult);

        //insertionSort
        int[] insertionSortResult = unSortedArray.clone();
        sort.insertionSort(insertionSortResult);
        assertArrayEquals(sortedArray, insertionSortResult);

        //bubbleSort
        int[] bubbleSortResult = unSortedArray.clone();
        sort.bubbleSort(bubbleSortResult);
        assertArrayEquals(sortedArray, bubbleSortResult);

        //mergeSort
        int[] mergeSortResult = unSortedArray.clone();
        sort.mergeSort(mergeSortResult);
        assertArrayEquals(sortedArray, mergeSortResult);

        //quickSort
        int[] quickSortResult = unSortedArray.clone();
        sort.quickSort(quickSortResult);
        assertArrayEquals(sortedArray, quickSortResult);

        //heapSort
        int[] heapSortResult = unSortedArray.clone();
        sort.heapSort(heapSortResult);
        assertArrayEquals(sortedArray, heapSortResult);

        //bucketSort
        int[] bucketSortResult = unSortedArray.clone();
        sort.bucketSort(bucketSortResult);
        assertArrayEquals(sortedArray, bucketSortResult);

        //shellSort
        int[] shellSortResult = unSortedArray.clone();
        sort.shellSort(shellSortResult);
        assertArrayEquals(sortedArray, shellSortResult);
    }

    // Helper method is created to assert equality of two int arrays
    private static void assertArrayEquals(int[] expected, int[] actual) throws AssertionError {
        if (expected.length != actual.length) throw new AssertionError("Array lengths differ");
        for (int i = 0; i < expected.length; i++) {
            if (expected[i] != actual[i]) {
                throw new AssertionError("Arrays differ at index " + i);
            }
        }
    }
}




