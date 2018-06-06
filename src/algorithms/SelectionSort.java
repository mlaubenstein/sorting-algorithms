package algorithms;

public class SelectionSort {

    private static int min;

    public static Integer[] sort (Integer[]givenArray){

        for (int i = 0; i<givenArray.length-1; i++){
            min = i;
            for (int j = i+1; j<givenArray.length; j++){
                if (givenArray[min] > givenArray[j]) {
                    min =j;
                }
            }
            if (min != i){
                int temp;
                temp = givenArray[min];
                givenArray[min] = givenArray[i];
                givenArray[i] = temp;
            }
        }
        return givenArray;
    }

}
