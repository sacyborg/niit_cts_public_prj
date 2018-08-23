package net.cts.niit.diptish.sudipta;

import java.util.Scanner;

public class Solution2Lab {
    public static void sol2lab(){
        int flag=0,count=1,i,p;
    int l[]=new int[4];
    System.out.println("Enter the no of seats respectively: ");
        Scanner st=new Scanner(System.in);
        for ( i=0;i<4;i++){
            l[i]=st.nextInt();
        }
        for ( i=0;i<4;i++) {
            System.out.println("");
            if (i <= 2) {
                System.out.println("");

                if (l[i] >= l[3]) {
                    System.out.println("");

                    flag++;
                    if (flag > 0) {
                        System.out.println("L" + count);
                        flag = 0;
                        count++;
                    }
                }

            }
        }
    }
}
