import java.util.Scanner;
public class Pattern_10 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //Input
        int n = sc.nextInt();
        
        //Logic
        //star
        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
        System.out.print("\n");
        }
        for(int i=n-1;i>=1;i--){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
        System.out.print("\n");
        }
        sc.close();
    }
}
