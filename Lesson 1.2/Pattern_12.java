import java.util.Scanner;
public class Pattern_12 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //n
        int n = sc.nextInt();

        //Logic
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
                System.out.print(" ");
            }
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);
                System.out.print(" ");
            }
            System.out.print("\n");
        }
        sc.close();
    }
}
