import java.util.Scanner;
public class Fibo {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        //Input
        System.out.print("Enter the element to be displayed: ");
        int ele = sc.nextInt();

        int a = 0;
        int b = 1;
        int c = 1;
        for(int i=0;i < ele-1;i++){
            c = a+b;
            a=b;
            b=c;
        }
        System.out.print(c);
        sc.close();
    }
}
