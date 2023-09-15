import java.util.Scanner;
public class If_else {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        //Input
        int a = sc.nextInt();
        int b = sc.nextInt();

        //logic
        if(a < b){
            System.out.print("Smaller");
        }
        else if(a > b){
            System.out.print("Greater");
        }
        else{
            System.out.print("Equal");
        }
        sc.close();
    }
}
