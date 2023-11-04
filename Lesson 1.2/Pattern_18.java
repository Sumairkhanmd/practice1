// Sample n 1:
// 3
// Sample Output 1:
// C
// C B 
// C B A

import java.util.Scanner;
public class Pattern_18{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //n
        int n = sc.nextInt();
        
        //Logic
       
        
        for(int i=1;i<=n;i++){
            char alpha = 'A';
            for(int j=1;j<n;j++){
            alpha++;
        }
            for(int j=0;j<i;j++){
                System.out.print(alpha);
                System.out.print(" ");
                alpha--;
            }
            System.out.print("\n");
        }
    }
}