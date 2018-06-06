package algorithms;

public class InsertionSort {
    private static int temp;
    public static Integer[] sort(Integer[]givenArray){

        for (int i = 0; i<givenArray.length; i++){
            temp = givenArray[i];
            while (i>0 && givenArray[i-1]>temp){
                givenArray[i] = givenArray[i-1];
                i--;
            }
            givenArray[i]= temp;
        }
        return givenArray;
    }
}
