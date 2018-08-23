package net.cts.niit.diptish.sudipta;

import java.util.Scanner;

public class Solution5MulRev {
    public static void sol5mul(){
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

            int mulli=1;
            int j=(x_ele-1)-i;
            mulli=arrup[i]*arrdw[j];
            //System.out.println(mulli+"->");
            int rev=0;
            int digit;
            while (mulli!=0){
                rev= rev*10;
                rev=rev+ (mulli%10);
                mulli=mulli/10;
            }
            System.out.println(rev+"->");
        }
    }
}
