package net.cts.niit.diptish.sudipta;

import java.util.Scanner;

public class Solution4 {
    public static void sol4(){
        int x_ele;
        Scanner st= new Scanner(System.in);
        System.out.println("Enter the number of element of each array: ");
        x_ele= st.nextInt();
        int arrup[]=new int[x_ele];
        int arrdw[]=new int[x_ele];
        System.out.println("First array");
        for (int i=0;i<x_ele;i++){
            System.out.println("Enter number :");
            arrup[i]=st.nextInt();
        }
        System.out.println("Second array");
        for (int i=0;i<x_ele;i++){
            System.out.println("Enter number :");
            arrdw[i]=st.nextInt();
        }
        System.out.println("Output");
        System.out.println();
        for (int i=0;i<x_ele;i++){
            int df= arrdw[i];
            while (df!=0){
                System.out.print(arrup[i]);
                df--;
            }
        }
    }
}
