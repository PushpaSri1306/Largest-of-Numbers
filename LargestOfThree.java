import java.util.Scanner;
public class LargestOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        scanner.close();

        int largest = findLargest(num1, num2, num3);
        System.out.println("Largest number: " + largest);
    }

    public static int findLargest(int num1, int num2, int num3) {
        if (num1 >= num2) {
            if (num1 >= num3) {
                return num1;
            } else {
                return num3;
            }
        } else {
            if (num2 >= num3) {
                return num2;
            } else {
                return num3;
            }
        }
    }
}


