package net.cts.niit.diptish.sudipta;

public class Solution5 {
    public static void s5(){
        System.out.println("\n Solution5:- );
        int sizeOfPyramid = 8;
        for(int i=1;i<=sizeOfPyramid;i++) {
        for(int j=i;j<=sizeOfPyramid-1;j++) {
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
