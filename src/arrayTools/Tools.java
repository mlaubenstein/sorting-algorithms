package arrayTools;

public class Tools  {

    public static Integer[] arrayGenerate(Integer[] arrayToGenerate) {
        for (int i = 0; i<arrayToGenerate.length; i++){
            arrayToGenerate[i]= (int)(Math.random ()*10);
        }
        return arrayToGenerate;
    }


    public static void arrayRead(Integer[] arrayToRead) {
        for (int i = 0; i<arrayToRead.length; i++){
            System.out.print ("|"+arrayToRead[i]+"|");
        }
        System.out.print ( "\n" );
    }


}
