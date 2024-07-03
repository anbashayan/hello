import java.util.Scanner;
public class simplecal {
    public static void main(String args[]){
        Scanner number = new Scanner(System.in);
        int num1 = number.nextInt();
        int num2 = number.nextInt();
        int num3 = number.nextInt();
        System.out.print("Sum = "+(num1+num2+num3));

    }
}
