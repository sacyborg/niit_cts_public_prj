package net.cts.niit.diptish.sudipta;

import java.util.Scanner;

public class Solution1Diag {
    public static void sold(){
        int x_row,x_col;
        int row,col,sumleft=0,sumright=0,sumtot=0;
        Scanner st= new Scanner(System.in);
        System.out.println("Enter the row:");
        x_row= st.nextInt();
        x_col= st.nextInt();
        int arr[][]= new int[x_row][x_col];
        for (row=0;row<arr.length;row++){
            for (col=0;col<arr[row].length;col++) {
             System.out.println("Enter number: ");
                arr[row][col] = st.nextInt();
                sumtot=sumtot+arr[row][col];
            }
        }

        for (row=0;row<x_row;row++){
            for (col=0;col<row;col++) {
                sumleft=sumleft+arr[row][col];
                //System.out.print(arr[row][col]);
            }
            System.out.println();
        }
        int sumdiag=0;
        for (int i = 0, j =0; i< x_row && j < x_col; i++, j++) {
            sumdiag= sumdiag + arr[i][j];

        }
        //System.out.println(sumdiag);
        sumleft=sumleft+sumdiag;
       // System.out.println(sumleft);

        sumright=sumtot-sumleft+sumdiag;
        //System.out.println(sumright);
        sumleft=sumleft-sumdiag;
        sumright=sumright-sumdiag;
        if(sumleft==sumright)
            System.out.println("YES");
        else
            System.out.println("NO");



    }
}
