import java.util.Scanner;
public class Pattern_11 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //Input
        int n = sc.nextInt();
        int var = 1;
        //Logic
        for(int i=1;i<=n;i++){
            if(i % 2 != 0){
                var = 1;
            }
            else{
                var = 0;
            }
            for(int j=0;j<i;j++){
                System.out.print(var);
                System.out.print(" ");
                var = 1 - var;
            }
            System.out.print("\n");
        }
        sc.close();
    }
}
