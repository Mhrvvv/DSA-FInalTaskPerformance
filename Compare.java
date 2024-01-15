import java.util.Scanner;
public class Compare {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int num1, num2;

        System.out.print("Enter the first number: ");
        num1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        num2 = sc.nextInt();

        if (num1 < num2) {
            System.out.println("The first number is less than the second number.");
        } else if (num1 > num2) {
            System.out.println("The first number is greater than the second number.");
        } else {
            System.out.println("The first number is equal to the second number.");
        }
    }
}