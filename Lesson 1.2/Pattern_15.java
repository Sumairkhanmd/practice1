import java.util.Scanner;
public class Pattern_15 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //n
        int n = sc.nextInt();

        //Logic
        for(int i=0;i<n;i++){
            char alpha = 'A';
            for(int j=n-i;j>=1;j--){
                System.out.print(alpha);
                System.out.print(" ");
                alpha++;
            }
            System.out.print("\n");
        }
        sc.close();
    }
}
