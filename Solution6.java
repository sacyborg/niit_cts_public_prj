package net.cts.niit.diptish.sudipta;

import java.util.Scanner;

public class Solution6 {
    public static void s6(){
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


        System.out.println("Output");
        for (row=0;row<arr.length;row++) {
            for (col=0;col<arr[row].length;col++) {
                if (row==0 && col== arr[row].length/2)
                    System.out.println(arr[row][col]);
                else if (row==1 && (((arr[row].length-2)/2)<=col && col<((arr[row].length+1)/2)+1))
                    System.out.println(arr[row][col]);
                else if (row==2)
                    System.out.println(arr[row][col]);
            }

        }




            }
    }

