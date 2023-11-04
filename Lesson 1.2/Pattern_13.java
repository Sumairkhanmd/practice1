import java.util.Scanner;
public class Pattern_13 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //n
        int n = sc.nextInt();
        int Count = 1;
        //Logic
        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print(Count);
                System.out.print(" ");
                Count++;
            }
            System.out.print("\n");
        }
        sc.close();
    }
}
