import java.util.Scanner;
public class Switch_case {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        //Input
        int Choice = sc.nextInt();

        switch (Choice) {
            case 1:
                int radius = sc.nextInt();
                System.out.print("Area of circle: "+2*Math.PI*radius);
                break;
            case 2:
                int length = sc.nextInt();
                int breadth = sc.nextInt();
                System.out.print("Area of rectangle: "+length*breadth);
                break;
            default:
                break;
        }
        sc.close();
    }
}
