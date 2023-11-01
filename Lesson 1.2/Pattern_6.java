// Input: 5

// Output:
// 1 2 3 4 5
// 1 2 3 4
// 1 2 3 
// 1 2  
// 1 

//Implementation
import java.util.Scanner;
public class Pattern_6 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        //Input
        int Input = sc.nextInt();

        //Logic
        for(int i=0;i<Input;i++){
            for(int j=1;j<=Input-i;j++){
                System.out.print(j);
                System.out.print(" ");
            }
            System.out.print("\n");
        }
        sc.close();
    }
}
