import java.util.Scanner;

public class pointscore {
    public static void main(String args[]){
        System.out.print("Enter Your Score :");
        Scanner score = new Scanner(System.in);
        int marks = score.nextInt();
        System.out.println("Your PointScore is "+(marks/10));
    }
}
