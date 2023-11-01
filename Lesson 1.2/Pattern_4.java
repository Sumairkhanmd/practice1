// Input: 5

// Output:
// 1
// 2 2 
// 3 3 3 
// 4 4 4 4 
// 5 5 5 5 5

//Implementation
import java.util.Scanner;
public class Pattern_4 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //Input
        int Input = sc.nextInt();

        //Logic
        for(int i=1;i<=Input;i++){
            for(int j=0;j<i;j++){
                System.out.print(i);
                System.out.print(" ");
            }
            System.out.print("\n");
        }
        sc.close();
    }
}
