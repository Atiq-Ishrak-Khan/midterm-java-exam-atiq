package algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sort {

    long executionTime = 0;
	/*
	 * Please implement all the sorting algorithm. Feel free to add helper methods.
	 * Store all the sorted data into one of the databases.
	 */


    public int[] selectionSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;

        for(int j=0; j<array.length-1; j++){
            int min = j;
            for(int i=j+1; i<array.length; i++) {
                if (array[i] < array[min])
                    min = i;
            }

            int temp = array[min];
            array[min] = array[j];
            array[j] = temp;
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] insertionSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        //implement here
        //(answer)
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }

            array[j + 1] = key;
        }


        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] bubbleSort(int [] array){
        int [] list = array;
        //implement here
        //(answer)
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        
        
        return list;
    }
    

    public int [] mergeSort(int [] array){
        int [] list = array;
        //implement here
        //(answer)
        if (array.length <= 1) {
            return list;
        }

        int mid = array.length / 2;
        int[] left = new int[mid];
        int[] right = new int[array.length - mid];

        System.arraycopy(array, 0, left, 0, mid);
        System.arraycopy(array, mid, right, 0, array.length - mid);


        mergeSort(left);
        mergeSort(right);


        merge(array, left, right);
        

        return list;
    }
        // Helper method implemented
    private void merge(int[] result, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                result[k++] = left[i++];
            } else {
                result[k++] = right[j++];
            }
        }

        while (i < left.length) {
            result[k++] = left[i++];
        }

        while (j < right.length) {
            result[k++] = right[j++];
        }
    }
    

    public int [] quickSort(int [] array){
        int [] list = array;
        //implement here
        //(answer)
        quickSort(list, 0, list.length - 1);
        

        return list;
    }


    
    public int [] heapSort(int [] array){
        int [] list = array;
        //implement here
        //(answer)

        buildMaxHeap(list); // Building a max heap

        for (int i = list.length - 1; i >= 0; i--) {

            int temp = list[0];
            list[0] = list[i];
            list[i] = temp;

            heapify(list, i, 0);
        }
        

        return list;
    }

    //creating helper method
    private void buildMaxHeap(int[] array) {
        int n = array.length;
        for (int i = (n / 2) - 1; i >= 0; i--) {
            heapify(array, n, i);
        }
    }

    private void heapify(int[] array, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && array[left] > array[largest]) {
            largest = left;
        }

        if (right < n && array[right] > array[largest]) {
            largest = right;
        }

        if (largest != i) {

            int temp = array[i];
            array[i] = array[largest];
            array[largest] = temp;

            heapify(array, n, largest);
        }
    }


    public int [] bucketSort(int [] array){
        int [] list = array;
        //implement here
        //(answer)
        int min = array[0];
        int max = array[0];
        for (int num : array) {
            if (num < min) {
                min = num;
            } else if (num > max) {
                max = num;
            }
        }

        int range = (max - min) / array.length + 1;

        List<List<Integer>> buckets = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            buckets.add(new ArrayList<>());
        }

        for (int num : array) {
            int bucketIndex = (num - min) / range;
            buckets.get(bucketIndex).add(num);
        }


        for (List<Integer> bucket : buckets) {
            Collections.sort(bucket);
        }

        int index = 0;
        for (List<Integer> bucket : buckets) {
            for (int num : bucket) {
                list[index++] = num;
            }
        }


        return list;
    }


    public int [] shellSort(int [] array){
        int [] list = array;
        //implement here
        //(answer)
        int n = array.length;

        for (int gap = n / 2; gap > 0; gap /= 2)
            for (int i = gap; i < n; i++) {
                int temp = array[i];
                int j;
                for (j = i; j >= gap && array[j - gap] > temp; j -= gap) {
                    array[j] = array[j - gap];
                }
                array[j] = temp;
            }

        return list;
    }

    public static void printSortedArray(int [] array){
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }

    public void quickSort(int[] num, int i, int i1) {
    }

    public void mergeSort(int[] num, int i, int i1) {
    }
}
