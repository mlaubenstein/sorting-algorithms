package algorithms;

public class BubbleSort {

    private static int temp;

    public static Integer[] sort(Integer[]givenArray){

        for(int i=1; i<givenArray.length; i++)
            for(int j=0; j<givenArray.length-i; j++)
                if(givenArray[j]>givenArray[j+1]) {
                    temp=givenArray[j];
                    givenArray[j]=givenArray[j+1];
                    givenArray[j+1]=temp;
                }
                return givenArray;
    }
}
