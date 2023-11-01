// Input: 5

// Output:
// 1
// 1 2 
// 1 2 3 
// 1 2 3 4 
// 1 2 3 4 5

//Implementaion
import java.util.Scanner;
public class Pattern_3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //Input
        int Input = sc.nextInt();

        //Logic
        for(int i=1;i<=Input;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
                System.out.print(" ");
            }
            System.out.print("\n");
        }
        sc.close();
    }
}
