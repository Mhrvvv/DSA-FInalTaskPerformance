import java.util.Scanner;
public class RecursiveFunction {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int maxNum;

        System.out.print("Enter max numbers to display: ");
        maxNum = sc.nextInt();

        display_num(1, maxNum);
    }

    public static void display_num(int currentNum, int maxNum) {

        if (currentNum <= maxNum) {
            System.out.print(currentNum);
            if (currentNum < maxNum) {
                System.out.print(", ");
            }
            display_num(currentNum + 1, maxNum);
        }
    }
}