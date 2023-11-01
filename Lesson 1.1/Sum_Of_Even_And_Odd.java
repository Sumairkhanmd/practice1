import java.util.Scanner;
public class Sum_Of_Even_And_Odd {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        //Input
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        //Logic
        int Even_Sum = 0;
        int Odd_Sum = 0;

        while(num != 0){
            int digit = num%10;
            if(digit%2 == 0){
                Even_Sum = Even_Sum + digit;
            }
            else if(num % 2 != 0){
                Odd_Sum = Odd_Sum + digit;
            }
            num = num/10;
        }
        System.out.print("The sum of even digits is: "+Even_Sum);
        System.out.print("The sum of odd digits is: "+Odd_Sum);
        sc.close();
    }
}
