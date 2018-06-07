package algorithms;

public class QuickSort {

    private static Integer[] tempArray;

    public static Integer[] sort(Integer[]givenArray){
        tempArray = givenArray;
        quicksort(0, tempArray.length-1);
        return tempArray;
    }

    private static void quicksort(int low, int high) {
        int i=low, j=high;
        int x=tempArray[low+(high-low)/2];

        while (i<=j) {
            while (tempArray[i]<x) i++;
            while (tempArray[j]>x) j--;
            if    (i<=j) {
                exchange(i, j);
                i++; j--;
                }
            }
            if (low<j) quicksort(low, j);
            if (i<high) quicksort(i, high);
        }

        private static void exchange(int i, int j) {
            int t=tempArray[i];
            tempArray[i]=tempArray[j];
            tempArray[j]=t;
        }
    }


