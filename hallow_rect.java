/*
        * * * * *
        *       *
        *       *
        * * * * *
 */

import java.util.*;
public class hallow_rect {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of rows : ");
        int n=sc.nextInt();
        System.out.println("Enter number of columns : ");
        int m=sc.nextInt();
        sc.close();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(i==1 || j==1 || i==n || j==m){
                    System.out.print("*");
                }else {
                System.out.print(" ");
            }
        }
            System.out.println();
        }
    }
}
