// 3
// Sample Output 1:
// A
// B B
// C C C

import java.util.Scanner;
public class Pattern_16 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        //n
        int n = sc.nextInt();

        //Logic
        char alpha = 'A';
        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print(alpha);
                System.out.print(" ");
            }
            alpha++;
            System.out.print("\n");
        }
        sc.close();
    }
}
