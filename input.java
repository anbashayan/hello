import java.util.Scanner;

public class input{
    public static void main(String args[]){
        System.out.println("Enter Your Name");
        Scanner name = new Scanner(System.in);
        String fname = name.nextLine();
        System.out.print("Your name is "+fname);

    }
}