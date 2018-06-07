package main;

import algorithms.BubbleSort;
import algorithms.InsertionSort;
import algorithms.SelectionSort;
import algorithms.ShellSort;
import arrayTools.Tools;


public class Main {

    private static SelectionSort   selectionSort;
    private static BubbleSort      bubbleSort;
    private static InsertionSort   insertionSort;
    private static ShellSort       shellSort;
    private static Integer[]       arrayTestSelectionSort;
    private static Integer[]       arrayTestBubbleSort;
    private static Integer[]       arrayTestInsertionSort;
    private static Integer[]       arrayTestShellSort;

    public static void main (String [] args){

        arrayTestSelectionSort= new Integer[(int) (Math.random ()*10)+10];
        System.out.println ( "\033[31munsorted Array:\033[0m " );
        Tools.arrayRead     ( Tools.arrayGenerate ( arrayTestSelectionSort ));

        selectionSort = new SelectionSort ();
        System.out.println ( "\033[31msorted Array by SelectionSort:\033[0m " );
        Tools.arrayRead ( selectionSort.sort ( arrayTestSelectionSort ));


        arrayTestBubbleSort= new Integer[(int) (Math.random ()*10)+10];
        System.out.println ( "\033[32munsorted Array: \033[0m" );
        Tools.arrayRead     ( Tools.arrayGenerate ( arrayTestBubbleSort ));

        bubbleSort = new BubbleSort ();
        System.out.println ( "\033[32msorted Array by BubbleSort:\033[0m " );
        Tools.arrayRead ( bubbleSort.sort ( arrayTestBubbleSort));


        arrayTestInsertionSort= new Integer[(int) (Math.random ()*10)+10];
        System.out.println ( "\033[33munsorted Array: \033[0m" );
        Tools.arrayRead     ( Tools.arrayGenerate ( arrayTestInsertionSort ));

        insertionSort = new InsertionSort ();
        System.out.println ( "\033[33msorted Array by InsertionSort: \033[0m" );
        Tools.arrayRead ( insertionSort.sort ( arrayTestInsertionSort));


        arrayTestShellSort = new Integer[(int)(Math.random ()*10)+10];
        System.out.println ( "\033[34munsorted Array: \033[0m" );
        Tools.arrayRead     ( Tools.arrayGenerate ( arrayTestShellSort ));

        shellSort = new ShellSort ();
        System.out.println ( "\033[34msorted Array by ShellSort: \033[0m" );
        Tools.arrayRead ( shellSort.sort ( arrayTestShellSort));





    }


}
