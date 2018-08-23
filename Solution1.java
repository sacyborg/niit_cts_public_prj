//1) Declare an array of size 10. Sort all those elements in descending order.

package net.cts.niit.diptish.sudipta;

import java.util.Scanner;

public class Solution1 {
    public static void s1(){

        int x,flag=0,temp;
        Scanner st= new Scanner(System.in);
        System.out.println("\n Solution1:- \n Enter the number of elements: ");
        x=st.nextInt();
        int arr[]= new int[x];

        for (int i=0;i<arr.length;i++){
            int z=i+1;
            System.out.println("Enter element "+z+" : ");
            arr[i]=st.nextInt();
            if (i==(arr.length-1))
                flag=1;
            else
                flag=0;
        }
        if (flag==0)
            System.out.println("All values are entered.");
        else
            System.out.println("I/P Error!");
//sorting

        for (int i = 0; i < arr.length; ++i) {
            for (int j = i + 1; j < arr.length; ++j) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    }
                    }
                    }
        System.out.println("Sorted array in decending order is");
        System.out.println();
        for (int i=0;i<arr.length;i++)
            System.out.print("-> "+arr[i]);
    }
}
