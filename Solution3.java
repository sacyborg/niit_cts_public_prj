package net.cts.niit.diptish.sudipta;

public class Solution3 {
    public static void s3(){
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        //int temp[]=new int[10];
        int t,temp;
        for (int i=0;i<10;i=i+2){
            temp=arr[i];
            t=arr[i+1];
            arr[i]=t;
            arr[i+1]=temp;
        }
        System.out.println("\n Solution3 sequence:-");
        for (int i=0;i<10;i++)
            System.out.print("-> "+arr[i]);
    }
}
