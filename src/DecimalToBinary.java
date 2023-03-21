import java.util.*;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal = scanner.nextInt();

        Stack<Integer> stack = new Stack<Integer>();
        while (decimal != 0) {
            int remainder = decimal % 2;
            stack.push(remainder);
            decimal /= 2;
        }

        System.out.print("Binary equivalent: ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }
}