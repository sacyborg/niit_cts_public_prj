package net.cts.niit.diptish.sudipta;

import java.util.Scanner;

public class Solution4 {
    public static void s4(){
        int x,flag=0,temp,count;
        Scanner st= new Scanner(System.in);
        System.out.println("\n Solution4:- \n Enter the number of elements: ");
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
            System.out.println("All values are entered.\n The secquence is: ");
        else
            System.out.println("I/P Error!");
        for (int i=0;i<arr.length;i++){
            count=arr[i];
            while (count!=0){
                System.out.print("-> "+arr[i]);
                count--;
            }
            System.out.print("--");
        }
    }
}
