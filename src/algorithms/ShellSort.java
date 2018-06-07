package algorithms;

public class ShellSort {

    private static int j;
    private static int temp;

    public static Integer[] sort (Integer[]givenArray){
        for (int gap = givenArray.length; gap>0;gap/=2)
            for (int i = gap; i<givenArray.length; i++){
                 temp = givenArray[i];

                 for (j = i; j >= gap && givenArray[j-gap]>temp;j-=gap)
                    givenArray[j] = givenArray[j-gap];

                 givenArray[j]= temp;
            }
        return givenArray;
    }
}
