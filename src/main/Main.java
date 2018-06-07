package main;

import algorithms.*;
import arrayTools.Tools;
import java.util.Arrays;

public class Main {

    private static SelectionSort   selectionSort;
    private static BubbleSort      bubbleSort;
    private static InsertionSort   insertionSort;
    private static ShellSort       shellSort;
    private static QuickSort       quickSort;

    private static Integer[]       arrayTestSelectionSort;
    private static Integer[]       arrayTestBubbleSort;
    private static Integer[]       arrayTestInsertionSort;
    private static Integer[]       arrayTestShellSort;
    private static Integer[]       arrayTestQuickSort;
    private static Integer[]       arrayTestArraysSort;

    public static void main (String [] args){

//SelctionSort
        arrayTestSelectionSort= new Integer[(int) (Math.random ()*10)+10];
        System.out.println ( "\033[31munsorted Array:\033[0m " );
        Tools.arrayRead     ( Tools.arrayGenerate ( arrayTestSelectionSort ));

        selectionSort = new SelectionSort ();
        System.out.println ( "\033[31msorted Array by SelectionSort:\033[0m " );
        Tools.arrayRead ( selectionSort.sort ( arrayTestSelectionSort ));

//BubbleSort
        arrayTestBubbleSort= new Integer[(int) (Math.random ()*10)+10];
        System.out.println ( "\033[32munsorted Array: \033[0m" );
        Tools.arrayRead     ( Tools.arrayGenerate ( arrayTestBubbleSort ));

        bubbleSort = new BubbleSort ();
        System.out.println ( "\033[32msorted Array by BubbleSort:\033[0m " );
        Tools.arrayRead ( bubbleSort.sort ( arrayTestBubbleSort));

//InsertionSort
        arrayTestInsertionSort= new Integer[(int) (Math.random ()*10)+10];
        System.out.println ( "\033[33munsorted Array: \033[0m" );
        Tools.arrayRead     ( Tools.arrayGenerate ( arrayTestInsertionSort ));

        insertionSort = new InsertionSort ();
        System.out.println ( "\033[33msorted Array by InsertionSort: \033[0m" );
        Tools.arrayRead ( insertionSort.sort ( arrayTestInsertionSort));

//ShellSort
        arrayTestShellSort = new Integer[(int)(Math.random ()*10)+10];
        System.out.println ( "\033[34munsorted Array: \033[0m" );
        Tools.arrayRead     ( Tools.arrayGenerate ( arrayTestShellSort ));

        shellSort = new ShellSort ();
        System.out.println ( "\033[34msorted Array by ShellSort: \033[0m" );
        Tools.arrayRead ( shellSort.sort ( arrayTestShellSort));

//QickSort
        arrayTestQuickSort = new Integer[(int) (Math.random () * 10) + 10];
        System.out.println ( "\033[35munsorted Array: \033[0m" );
        Tools.arrayRead     ( Tools.arrayGenerate ( arrayTestQuickSort ));

        quickSort = new QuickSort ();
        System.out.println ( "\033[35msorted Array by QuickSort: \033[0m" );
        Tools.arrayRead ( quickSort.sort ( arrayTestQuickSort));

//ArraysSort
        arrayTestArraysSort = new Integer[(int)(Math.random ()*10)+10];
        System.out.println ( "\033[36munsorted Array: \033[0m"  );
        Tools.arrayRead     ( Tools.arrayGenerate ( arrayTestArraysSort));

        Arrays.sort (arrayTestArraysSort);
        System.out.println ( "\033[36mSo geht es einfacher :P : \033[0m"  );
        Tools.arrayRead ( arrayTestArraysSort );










    }


}
