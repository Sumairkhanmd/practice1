// Input: 5

// Output:
//     *
//    ***  
//   *****
//  *******
// *********


//Implementation
import java.util.Scanner;
public class Pattern_7{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //Input
        int Input = sc.nextInt();
        
        //Logic
        for(int i=0;i<Input;i++){
            for(int j=Input-i-1;j>0;j--){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i+1;j++){
                System.out.print("*");
            }
            for(int j=Input-i-1;j>0;j--){
                System.out.print(" ");
            }
            System.out.print("\n");
        }
        sc.close();
    }
}