package net.cts.niit.diptish.sudipta;

import java.util.Scanner;

public class Solution3 {
    public static void s3(){
        int x_row,x_col,flag=0,temp,row,col;
        Scanner st= new Scanner(System.in);
        System.out.println("\n Solution3:- \n Enter the number of row: ");
        x_row=st.nextInt();
        System.out.println("Enter the number of collumn: ");
        x_col=st.nextInt();
        int arr[][]= new int[x_row][x_col];
        System.out.println("Array size: "+x_row+"X"+x_col);
        for (row=0;row<arr.length;row++) {
            for (col = 0; col < arr[row].length; col++) {

                System.out.println("Enter element : ");
                arr[row][col] = st.nextInt();
            }
        }
        int xn_row=x_row*x_col;
        int arrt[]=new int[xn_row];
        int xn_count=0;
        for (row=0;row<arr.length;row++) {
            for (col = 0; col < arr[row].length; col++) {
                arrt[xn_count]=arr[row][col];
                xn_count++;
            }
        }


//sorting

        for (int i = 0; i < arrt.length; ++i) {
            for (int j = i + 1; j < arrt.length; ++j) {
                if (arrt[i] < arrt[j]) {
                    temp = arrt[i];
                    arrt[i] = arrt[j];
                    arrt[j] = temp;
                }
            }
        }
        System.out.println("MAX AND MIN numbers are");
        System.out.println();
        for (int i=0;i<arrt.length;i++) {
            if (i==0)
                System.out.print("Max -> " + arrt[i]+"\t");
            else if (i==arrt.length-1)
                System.out.print("Min -> " + arrt[i]+"\t");
        }
    }
}
