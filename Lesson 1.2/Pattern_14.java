import java.util.Scanner;
public class Pattern_14 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //n
        int n = sc.nextInt();
        
        //Logic
        for(int i=1;i<=n;i++){
            char alpha = 'A';
            for(int j=0;j<i;j++){
                System.out.print(alpha);
                System.out.print(" ");
                alpha++;
            }
            System.out.print("\n");
        }
        sc.close();
    }
}
