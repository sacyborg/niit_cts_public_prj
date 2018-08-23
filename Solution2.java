package net.cts.niit.diptish.sudipta;

public class Solution2 {
    public static void s2(){
        System.out.println("\n Solution2 sequence:-" );
        int arr1[]={1,2,3,4,5};
        int arr2[]={11,12,13,14,15};
        int temp[]= new int[5];
        for (int i=0;i<5;i++){
            temp[i]=arr1[i];
            arr1[i]=arr2[i];
            arr2[i]=temp[i];
        }
        for (int i=0;i<10;i++){
            if (i<5){
                System.out.print("-> "+arr1[i]);
            }
            else {
                System.out.print("->"+arr2[i-5]);
            }
        }
    }
}
