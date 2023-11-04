// Sample n 1:
// 3
// Sample Output 1:
//     A
//   A B A
// A B C B A

import java.util.Scanner;
public class Pattern_17 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        //n
        int n = sc.nextInt();

        //Logic
        for(int i=1;i<=n;i++){
            //Spacing
            for(int j=n-i;j>=1;j--){
                System.out.print(" ");
            }
            //alpha
            char alpha = 'A';
            for(int j=0;j<i;j++){
                
                System.out.print(alpha);
                alpha++;
            }
            
            alpha -= 2;
            for(int j=1;j<i;j++)
            {
                System.out.print(alpha);
                alpha--;
            }
            System.out.print("\n");
        }
        sc.close();
    }
}
