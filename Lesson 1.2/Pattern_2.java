// Input: 5

// Output:
// * 
// * * 
// * * * 
// * * * * 
// * * * * *

//Implementaion
import java.util.Scanner;
public class Pattern_2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //Input
        int Input = sc.nextInt();

        //Logic
        for(int i=1;i<=Input;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        sc.close();
    }
}
