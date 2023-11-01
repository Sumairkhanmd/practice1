// Input: 5

// Output:
// * * * * *
// * * * * *
// * * * * *
// * * * * *
// * * * * *

import java.util.Scanner;

public class Pattern_1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Input
        int Input = sc.nextInt();

        // Logic
        for (int i = 0; i < Input; i++) {
            for (int j = 0; j < Input; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        sc.close();
    }

}
