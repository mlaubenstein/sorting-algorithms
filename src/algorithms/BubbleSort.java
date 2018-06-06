package algorithms;

public class BubbleSort {
    private static int temp;
    private static boolean swapped = true;

    public static Integer[]sort(Integer[]givenArray){
        do{
            for (int i = 0; i<givenArray.length-1; i++ ){
                if (givenArray[i]>givenArray[i++]){
                    temp = givenArray[i];
                    givenArray[i] = givenArray[i++];
                    givenArray[i++] = temp;
                    swapped = true;
                }
                swapped = false;
            }
        }while (swapped == true);
        return givenArray;
    }
}
