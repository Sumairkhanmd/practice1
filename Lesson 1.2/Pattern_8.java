// Input: 5

// Output:

// *********
//  *******
//   *****
//    ***
//     *

//Implementation
import java.util.Scanner;

public class Pattern_8 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // Input
        int Input = sc.nextInt();

        // Logic
        for(int i=0;i<Input;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*(Input-i)-1;j++){
                System.out.print("*");
            }
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            System.out.print("\n");
        }
        
        sc.close();
    }
}
