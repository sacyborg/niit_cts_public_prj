
//4) Declare a 2-D array of size 3X3.  Display the numbers which are at 4 corners.
package net.cts.niit.diptish.sudipta;

public class Solution4 {
    public static void s4(){
        System.out.println("\n Solution4:- );
        int arry[][]={{1,2,3},{4,5,6},{7,8,9}};
        for (int row=0;row<arry.length;row++){
            for (int col=0;col<arry[row].length;col++){
                if (row==0&&col==0)
                    System.out.print("\t"+arry[row][col]);
                else if (row==0 && col==2)
                    System.out.print("\t"+arry[row][col]);
                else if (row==2&&col==0)
                    System.out.print("\t"+arry[row][col]);
                else if (row==2&&col==2)
                    System.out.print("\t"+arry[row][col]);

            }
            System.out.println();
        }
    }
}
