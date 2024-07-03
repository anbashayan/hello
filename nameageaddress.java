import java.util.Scanner;

public class nameageaddress {
    public static void main(String args[]){
        System.out.print("Enter Your Name : ");
        Scanner name = new Scanner(System.in);
        String fname = name.nextLine();
        System.out.print("Enter Your Address : ");
        String address = name.nextLine();
        System.out.print("Enter Your Age : ");
        int age = name.nextInt();
        System.out.println("Your name is : "+fname);
        System.out.println("Your address is :"+address);
        System.out.println("Your age is :"+age);
    }
}
