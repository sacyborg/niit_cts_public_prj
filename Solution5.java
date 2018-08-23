package net.cts.niit.diptish.sudipta;

import java.util.Scanner;

public class Solution5 {
    public static void s5(){
        int arr[][]= new int[3][5];
        int row,col;
        System.out.println("\n Solution 6:-");
        Scanner st= new Scanner(System.in);
        for (row=0;row<arr.length;row++) {
            for (col = 0; col < arr[row].length; col++) {
                System.out.println(" \n Enter the number:");
                arr[row][col] = st.nextInt();
            }
        }

        for (row=0;row<arr.length;row++) {
            for (col = 0; col < arr[row].length; col++) {

                if (row==arr.length/2&&col==arr[arr.length/2].length/2)
                System.out.println("\n The middle number is:"+arr[row][col]);

            }
        }
    }
}
