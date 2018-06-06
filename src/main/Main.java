package main;

import algorithms.BubbleSort;
import algorithms.SelectionSort;

public class Main {

    public static void main (String [] args){

        SelectionSort selectionSort;
        BubbleSort bubbleSort;
        Integer [] array;

        array= new Integer[(int) (Math.random ()*10)+1];
        arrayGenerate ( array );
        arrayRead ( array );


        selectionSort = new SelectionSort ();
        arrayRead ( selectionSort.sort ( array ));

        bubbleSort = new BubbleSort ();
        arrayRead ( bubbleSort.sort (array));


    }

    public static Integer[] arrayGenerate(Integer[]arrayToGenerate){
        for (int i = 0; i<arrayToGenerate.length; i++){
            arrayToGenerate[i]= (int)(Math.random ()*10);
        }
        return arrayToGenerate;
    }
    public static void arrayRead(Integer[]arrayToRead){
        for (int i = 0; i<arrayToRead.length; i++){
            System.out.print ("|"+arrayToRead[i]+"|");
        }
        System.out.print ( "\n" );

    }
}
