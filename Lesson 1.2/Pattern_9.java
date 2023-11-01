import java.util.Scanner;
public class Pattern_9 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //Input
        int n = sc.nextInt();

        //Logic
        for(int i=1;i<=n;i++){
            //spacing
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            //star
            for(int j=0;j<(2*i-1);j++){
                System.out.print("*");
            }
            //spacing
            for(int j=0;j<=n-i;j++){
                System.out.print(" ");
            }
            System.out.println(" ");
        }

        for(int i=n-1;i>=1;i--){
            //spacing
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            //star
            for(int j=0;j<(2*i-1);j++){
                System.out.print("*");
            }
            //spacing
            for(int j=0;j<=n-i;j++){
                System.out.print(" ");
            }
            System.out.println(" ");
        }
        sc.close();
    }
}
