import java.util.Scanner;
public class Array_demo {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        //Input
        int[] arr = new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        arr[3] +=10;
        //Output
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        sc.close();
    }
}
