// 3
// Sample Output 1:
// ***
// * *
// ***

import java.util.Scanner;
public class Pattern_21 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //n
        int n = sc.nextInt();

        //Logic
        if(n==1){
            System.out.print("*");
        }
        else{
        //first line
        for(int i=1;i<=n;i++){
            System.out.print("*");
        }
        System.out.print("\n");
        for(int i=1;i<=n-2;i++){
            System.out.print("*");
            for(int j=1;j<=n-2;j++){
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.print("\n");
        }
        //Last line
        for(int i=1;i<=n;i++){
            System.out.print("*");
        }
    }
    sc.close();
    }
}
