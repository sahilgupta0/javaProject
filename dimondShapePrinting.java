import java.util.Scanner;

public class dimondShapePrinting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of row : ");
        int input = sc.nextInt();
        int leftRange = (input * 2 - 1) / 2 + 1;
        int rightRange = (input * 2 - 1) / 2 + 1;

        for (int i = 0; i < input; i++) {
            for (int j = 0; j < input * 2; j++) {
                if (j >= leftRange && j <= rightRange) {
                    System.out.print("*");
                } else
                    System.out.print(" ");
            }
            System.out.print("\n");
            leftRange -= 1;
            rightRange += 1;
        }

        leftRange += 2;
        rightRange -= 2;

        for (int i = 0; i < input; i++) {
            for (int j = 0; j < input * 2; j++) {
                if (j >= leftRange && j <= rightRange) {
                    System.out.print("*");
                } else
                    System.out.print(" ");
            }
            System.out.print("\n");
            leftRange += 1;
            rightRange -= 1;
        }
    }
}
