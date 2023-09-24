import java.util.Scanner;
public class Multi_Dim_Arrray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        //Input
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = sc.nextInt();

        int[][] arr = new int[rows][columns];
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                System.out.print(arr[i][j]);
            }
            System.out.print("\n");
        }
        sc.close();
    }
}
