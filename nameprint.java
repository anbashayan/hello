//Here Name and Age have been taken from user..
import java.util.Scanner;
public class nameprint {
    public static void main(String args[]){
        System.out.print("Enter Your Name:");
        Scanner name = new Scanner(System.in);
        String Name = name.nextLine();
        System.out.print("Enter Your Age:");
        int Age = name.nextInt();
        System.out.println("Your name is "+Name);
        System.out.println("Your age is "+Age);
    }
}
