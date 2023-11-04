import java.util.Scanner;
public class Pattern_20 {
    public static void main(String args[]){
         Scanner sc = new Scanner(System.in);
         //n
         int n = sc .nextInt();

         //Logic
         for(int i=1;i<=n;i++){
            //First triangle
            for(int j=0;j<i;j++){
                System.out.print("*");
                System.out.print(" ");
            }
            //first spacing
            for(int j=n-i;j>=1;j--){
                System.out.print(" ");
                System.out.print(" ");
            }
            //Second spacing
            for(int j=n-i;j>=1;j--){
                System.out.print(" ");
                System.out.print(" ");
            }
            //Second triangle
            for(int j=0;j<i;j++){
                System.out.print("*");
                System.out.print(" ");
            }
            //Line spacing
            System.out.print("\n");
         }
         for(int i=1;i<=n;i++){
            //third tri
            for(int j=n-i;j>=1;j--){
                System.out.print("*");
                System.out.print(" ");
            }
            //third space
            for(int j=0;j<i;j++){
                System.out.print(" ");
                System.out.print(" ");
            }
            //fourth space
            for(int j=0;j<i;j++){
                System.out.print(" ");
                System.out.print(" ");
            }
            //fourth tri
            for(int j=n-i;j>=1;j--){
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.print("\n");
         }
         sc.close();
    }
}
