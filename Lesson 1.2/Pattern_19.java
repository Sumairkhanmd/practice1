// Sample n 1:
// 3
// Sample Output 1:
// * * * * * * 
// * *     * * 
// *         * 
// *         * 
// * *     * * 
// * * * * * * 

import java.util.Scanner;
public class Pattern_19 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //n
        int n = sc.nextInt();

        //Logic
        for(int i=1;i<=n;i++){
            //First triangle
            for(int j=n-i+1;j>=1;j--){
                System.out.print("* ");
            }
            //first spacing
            for(int j=1;j<i;j++){
                System.out.print("  ");
            }
            //second spacing
            for(int j=1;j<i;j++){
                System.out.print("  ");
            }
            //Second triangle
            for(int j=n-i+1;j>=1;j--){
                System.out.print("* ");
            }
            //Line spacing
            System.out.print("\n");
        }
        for(int i=1;i<=n;i++){
            //third triangle
            for(int j=0;j<i;j++){
                System.out.print("* ");
            }
            //third spacing
            for(int j=n-i;j>=1;j--){
                System.out.print("  ");
            }
            //fourth triangle
            for(int j=n-i;j>=1;j--){
                System.out.print("  ");
            }
            //fourth triangle
            for(int j=0;j<i;j++){
                System.out.print("* ");
            }
            //Line spacing
            System.out.print("\n");
        }
        sc.close();
    }
}
