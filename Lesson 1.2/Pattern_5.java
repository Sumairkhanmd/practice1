import java.util.Scanner;

public class Pattern_5 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // Input
        int Input = sc.nextInt();

        // Logic
        for (int i = 0; i < Input; i++) {
            for (int j = Input - i; j > 0; j--) {
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.print("\n");
        }
        sc.close();
    }
}
