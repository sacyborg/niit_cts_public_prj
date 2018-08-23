package net.cts.niit.diptish.sudipta;

import java.util.Scanner;

public class Solution1 {
    public static void s1(){
        System.out.println("\n Solution1:- ");

        int x;
        Scanner st= new Scanner(System.in);
        System.out.println("No of elements :");
        x= st.nextInt();
        int num[]= new int[x];
        for (int i=0;i<num.length;i++){

            System.out.println("Enter element "+i+" : ");
            num[i]=st.nextInt();
            if (num[i]<0 || num[i]==0){
                System.out.println("Invalid input");
                System.out.println("Enter element "+i+" : ");
                num[i]=st.nextInt();
            }
        }
        for (int i=0;i<num.length;i++){
            System.out.println(num[i]);
        }
    }
}
