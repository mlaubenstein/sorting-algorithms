package main;

import algorithms.BubbleSort;
import algorithms.InsertionSort;
import algorithms.SelectionSort;
import arrayTools.Tools;

import javax.jnlp.IntegrationService;


public class Main {

    public static void main (String [] args){

        SelectionSort   selectionSort;
        BubbleSort      bubbleSort;
        InsertionSort   insertionSort;
        Integer[]       array;
        Integer[]       array2;
        Integer[]       array3;





        array= new Integer[(int) (Math.random ()*10)+1];
        Tools.arrayRead     ( Tools.arrayGenerate ( array ));

        array2= new Integer[(int) (Math.random ()*10)+1];
        Tools.arrayRead     ( Tools.arrayGenerate ( array2 ));

        array3= new Integer[(int) (Math.random ()*10)+1];
        Tools.arrayRead     ( Tools.arrayGenerate ( array3 ));


        selectionSort = new SelectionSort ();
        Tools.arrayRead ( selectionSort.sort ( array ));

        bubbleSort = new BubbleSort ();
        Tools.arrayRead ( bubbleSort.sort ( array2));

        insertionSort = new InsertionSort ();
        Tools.arrayRead ( insertionSort.sort ( array3));


    }


}
